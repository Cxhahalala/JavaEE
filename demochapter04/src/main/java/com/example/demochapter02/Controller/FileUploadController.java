package com.example.demochapter02.Controller;

import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@RestController
public class FileUploadController {
    // 文件上传保存的目标目录路径
    private final String UPLOAD_DIR = "D:/images/";  // 可修改为其他绝对路径
    //MultipartFile是Spring框架提供的一个用于处理文件上传的类
    @PostMapping("/upload")
    public ResponseEntity<String> handleFileUpload(@RequestParam("file") MultipartFile file) {
        //检查文件是否为空
        if (file.isEmpty()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("文件为空");
        }

        try {
            // 确保上传目录存在，如果不存在则创建
            Path uploadPath = Paths.get(UPLOAD_DIR);//获取目标目录的Path对象
            if (!Files.exists(uploadPath)) {
                Files.createDirectories(uploadPath);  // 创建文件夹
            }

            // 文件完整路径
            Path path = uploadPath.resolve(file.getOriginalFilename());
            // 复制文件，StandardCopyOption.REPLACE_EXISTING:如果存在那么就替换
            Files.copy(file.getInputStream(), path, StandardCopyOption.REPLACE_EXISTING);

            return ResponseEntity.ok("文件上传成功: " + file.getOriginalFilename());
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("文件上传失败");
        }
    }
    @GetMapping("/download")
    public ResponseEntity<Resource> downloadFile(@RequestParam("filename") String filename){
        try{
            Path path=Paths.get(UPLOAD_DIR).resolve(filename).normalize();
            Resource resource= new UrlResource(path.toUri());
            if(resource.exists()){
                return ResponseEntity.ok()
                        .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"")
                        .body(resource);
            }else{
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
            }
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }
}
