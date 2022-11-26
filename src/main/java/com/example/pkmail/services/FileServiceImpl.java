package com.example.pkmail.services;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Service
public class FileServiceImpl {
public void uploadFile(MultipartFile file) throws IOException {
    file.transferTo(new File("C:\\Users\\Potter\\Desktop\\pakmail2\\"+file.getOriginalFilename()));
}
}
