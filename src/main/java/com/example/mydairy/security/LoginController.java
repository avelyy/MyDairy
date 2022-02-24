package com.example.mydairy.security;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.logging.Logger;

@RestController
public class LoginController {
  final private static Logger LOG = Logger.getGlobal();
  public static final String SECURED_TEXT = "Hello from the secured resource!";

  @RequestMapping("/login")
  public String login(HttpServletRequest request, HttpServletResponse response) {
    LOG.info("GET successfully called on /login resource");
    return "OK";
  }

}