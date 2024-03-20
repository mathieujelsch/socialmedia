package com.example.socialmedia.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/demo")
public class DemoController {

  @GetMapping("/protected")
  public String helloSecure() {
      return "Home protected";
  }

  @GetMapping("/public")
  public String helloPublic() {
      return "Home public";
  }

  @GetMapping("/user")
  public String helloUser() {
      return "hello user";
  }

}
