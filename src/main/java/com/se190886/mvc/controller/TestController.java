package com.se190886.mvc.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public class TestController {


    @GetMapping("/view-content")
    public ResponseEntity<String> getContent(){
        return ResponseEntity.ok("demo github webhook ");
    }

}
