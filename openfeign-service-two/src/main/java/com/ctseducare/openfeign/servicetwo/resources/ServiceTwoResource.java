package com.ctseducare.openfeign.servicetwo.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ctseducare.openfeign.servicetwo.feignclients.ServiceOneFeignClient;

import io.github.resilience4j.retry.annotation.Retry;

@RestController
public class ServiceTwoResource {
  
  @Autowired
  private ServiceOneFeignClient serviceOne;
  
  @GetMapping("/servicetwo")
  public String hello() {
    return "Hello, I am service TWO from FeignClient sample!!!";
  }
  
  @GetMapping("/invokeserviceone")
  @Retry(name = "serviceone-fallback", fallbackMethod = "fallbackMethod")
  public String serviceone() {
    System.out.println("is  down...");
    return serviceOne.hello();
  }
  
  public String fallbackMethod(Exception ex) {
    return "The serviceone is down!!!";
  }
    
}
