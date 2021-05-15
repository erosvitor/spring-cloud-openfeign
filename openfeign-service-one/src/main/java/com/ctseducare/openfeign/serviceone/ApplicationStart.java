package com.ctseducare.openfeign.serviceone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ApplicationStart {

  public static void main(String[] args) {
    SpringApplication.run(ApplicationStart.class, args);
  }
  
  @GetMapping("/serviceone")
  public String hello() {
    return "Hello, I am service ONE from FeignClient sample!!!";
  }

}
