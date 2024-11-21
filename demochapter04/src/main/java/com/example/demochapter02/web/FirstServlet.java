package com.example.demochapter02.web;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "FirstServlet", urlPatterns = "/firstServlet/")
public class FirstServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        System.out.println("hello FirstServlet");
        resp.getWriter().write("hello FirstServlet");
    }
}

