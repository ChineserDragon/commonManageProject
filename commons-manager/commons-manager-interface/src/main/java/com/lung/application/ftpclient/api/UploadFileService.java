package com.lung.application.ftpclient.api;


public interface UploadFileService {

    Boolean uploadFileDemo(byte[] bytes, String originalFilename);

    String show(String str);
}
