package com.lung.application.controller;

import com.lung.application.ftpclient.api.UploadFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@RestController
@RequestMapping(value = "uploadFile")
public class UploadFileController {

    @Autowired
    private UploadFileService uploadFileService;

    @RequestMapping(value = "upload")
    public String uploadFile(HttpServletRequest request) {
        MultipartHttpServletRequest multipartHttpServletRequest = (MultipartHttpServletRequest) request;
        MultipartFile file = multipartHttpServletRequest.getFile("file");
        try {
            byte[] bytes = file.getBytes();
            String originalFilename = file.getOriginalFilename();
            Boolean aBoolean = null;
            aBoolean = uploadFileService.uploadFileDemo(bytes, originalFilename);
            if (aBoolean) {
                return "上传成功";
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "上传失败";

    }

}
