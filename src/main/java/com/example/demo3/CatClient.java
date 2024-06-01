package com.example.demo3;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "cat-service", url = "https://catfact.ninja")
public interface CatClient {

    @GetMapping("/fact")
    Cat getCatsInfo();

    @GetMapping("/breeds")
    BreedsResponse getCatsBreeds();

    @GetMapping("/facts")
    CatResponse getAllCatsInfo();
}