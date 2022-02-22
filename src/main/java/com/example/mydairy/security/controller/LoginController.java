package com.example.mydairy.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

@Controller
//@RequestMapping("/api")
public class LoginController {

    //로그인 Form
    @GetMapping("/login")
    public void loginForm(HttpServletRequest request, Model model){
        System.out.println("##########Login Controller!!!!!!!!!");
    }
}
