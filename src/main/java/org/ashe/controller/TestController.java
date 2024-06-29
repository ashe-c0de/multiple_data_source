package org.ashe.controller;

import org.ashe.service.TestService;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestController {

    @Resource
    private TestService testService;

    @GetMapping("/insert")
    public HttpEntity<Object> insertEmployee(){
        return ResponseEntity.ok(testService.insertEmployee());
    }

    @GetMapping("/insert2")
    public HttpEntity<Object> insertUser(){
        return ResponseEntity.ok(testService.insertUser());
    }

    @GetMapping("/query")
    public HttpEntity<Object> query(){
        return ResponseEntity.ok(testService.query());
    }
}
