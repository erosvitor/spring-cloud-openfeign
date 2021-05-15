package com.ctseducare.openfeign.servicetwo.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ctseducare.openfeign.servicetwo.feignclients.ServiceOneFeignClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class ServiceTwoResource {
  
  @Autowired
  private ServiceOneFeignClient serviceOne;
  
  @GetMapping("/servicetwo")
  public String hello() {
    return "Hello, I am service TWO from FeignClient sample!!!";
  }
  
  @GetMapping("/invokeserviceone")
  @HystrixCommand(fallbackMethod = "fallback")
  public String serviceone() {
    return serviceOne.hello();
  }
  
  public String fallback() {
    return "Service ONE is down!!!";
  }
  
}
