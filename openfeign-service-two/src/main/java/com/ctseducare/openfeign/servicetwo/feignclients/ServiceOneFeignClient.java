package com.ctseducare.openfeign.servicetwo.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="service-one", url = "localhost:8890")
public interface ServiceOneFeignClient {

  @GetMapping("/serviceone")
  String hello();
   
}
