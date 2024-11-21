package com.example.demochapter02.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping("/test")
    public String toTestPage(Model model) {
        String msg = "数据测试";
        Boolean flagValue = true;
        model.addAttribute("title", "来自Controller");
        model.addAttribute("flag", flagValue);
        return "login";
    }
}

