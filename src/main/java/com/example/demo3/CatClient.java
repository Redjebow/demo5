package com.example.demo3;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "cat-service", url = "https://catfact.ninja/fact")
public interface CatClient {

    @GetMapping("/")
    CatInfo getCatsInfo();
}