package com.rohit.auth.controller;

import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

import javax.print.attribute.HashAttributeSet;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class UserController {
    @GetMapping("path")
    public Map<String,Object> getMethodName() {
        Map<String,Object> result=new HashMap<>();
        result.put("name", "rohit");
        result.put("id",20);
        return result;
    }
}
