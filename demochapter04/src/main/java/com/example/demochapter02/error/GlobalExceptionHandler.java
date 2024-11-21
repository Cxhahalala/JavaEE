package com.example.demochapter02.error;

import com.example.demochapter02.exception.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler {
//    @ExceptionHandler(ResourceNotFoundException.class)
//    public ResponseEntity<Map<String,Object>> handleResourceNotFoundException(ResourceNotFoundException ex, WebRequest request){
//        // 自定义返回的 JSON 数据
//        Map<String, Object> body = new HashMap<>();
//        body.put("message", ex.getMessage());
//        body.put("status", HttpStatus.NOT_FOUND.value());
//
//        return new ResponseEntity<>(body, HttpStatus.NOT_FOUND);
//    }
//    @ExceptionHandler(RuntimeException.class)
//    public ResponseEntity<Map<String, Object>> handleGlobalException(RuntimeException ex, WebRequest request) {
//        // 自定义返回的 JSON 数据
//        Map<String, Object> body = new HashMap<>();
//        body.put("message", "服务器内部错误");
//        body.put("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
//
//        return new ResponseEntity<>(body, HttpStatus.INTERNAL_SERVER_ERROR);
//    }
// 处理自定义的 ResourceNotFoundException 异常，返回 HTML 页面
@ExceptionHandler(ResourceNotFoundException.class)
public ModelAndView handleResourceNotFoundException(ResourceNotFoundException ex, WebRequest request) {
    ModelAndView mav = new ModelAndView();
    mav.setViewName("error404");  // 指定返回的 HTML 页面模板
    mav.setStatus(HttpStatus.NOT_FOUND);  // 设置状态码为404
    mav.addObject("message", ex.getMessage());  // 将错误信息传递到页面
    return mav;
}

    // 处理所有 RuntimeException 异常，返回 HTML 错误页面
    @ExceptionHandler(RuntimeException.class)
    public ModelAndView handleRuntimeException(RuntimeException ex, WebRequest request) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("error500");  // 返回 error500.html 页面
        mav.setStatus(HttpStatus.INTERNAL_SERVER_ERROR);  // 设置状态码为500
        mav.addObject("message", ex.getMessage());  // 将异常消息传递到页面
        return mav;
    }
}
