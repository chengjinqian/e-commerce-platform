package com.mmall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by chengjinqian on 2017/7/16.
 */
public interface IFileService {

    String upload(MultipartFile file, String path);
}
