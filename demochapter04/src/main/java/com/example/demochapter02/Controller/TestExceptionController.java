package com.example.demochapter02.Controller;

import com.example.demochapter02.exception.ResourceNotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
public class TestExceptionController {
    // 访问这个端点会触发 ResourceNotFoundException
    @GetMapping("/notfound")
    public String trigger404() {
        throw new ResourceNotFoundException("资源未找到");
    }

    // 访问这个端点会触发一个一般的运行时异常
    @GetMapping("/trigger-error")
    public String triggerError() {
        System.out.println("进入了trigger-error");
        throw new RuntimeException("服务器内部错误");
    }
}
