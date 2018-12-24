package com.lung.application.service;

import com.lung.application.ftpclient.api.UploadFileService;
import com.lung.common.utils.FtpUtil;
import com.lung.common.utils.IDUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

@Service
public class UploadFileServiceImpl implements UploadFileService {

    @Value("#{config['ftpclient.host']}")
    private String host;
    @Value("#{config['ftpclient.port']}")
    private int port;
    @Value("#{config['ftpclient.username']}")
    private String username;
    @Value("#{config['ftpclient.password']}")
    private String password;
    @Value("#{config['ftpclient.basePath']}")
    private String basePath;
    @Value("#{config['ftpclient.filePath']}")
    private String filePath;

    @Override
    public Boolean uploadFileDemo(byte[] bytes, String originalFilename) {
        String substring = originalFilename.substring(originalFilename.lastIndexOf("."));
        String fileName = IDUtils.genImageName() + substring;
        InputStream inputStream = new ByteArrayInputStream(bytes);
        boolean b = FtpUtil.uploadFile(host, port, username, password, basePath, filePath, fileName, inputStream);
        return b;
    }

    @Override
    public String show(String str) {
        System.out.println(str);
        return str;
    }
}
