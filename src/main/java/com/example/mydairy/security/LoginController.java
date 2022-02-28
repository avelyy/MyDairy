package com.example.mydairy.security;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.logging.Logger;

@RestController
public class LoginController {
  final private static Logger LOG = Logger.getGlobal();
  public static final String SECURED_TEXT = "Hello from the secured resource!";

  @PostMapping("/login")
  public String login(HttpServletRequest request, HttpServletResponse response) {
    LOG.info("GET successfully called on /login resource");
    //[ToDo] Security 인증
    return "OK";
  }

}