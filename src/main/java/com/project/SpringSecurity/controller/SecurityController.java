package com.project.SpringSecurity.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SecurityController {

    @PostMapping("/adddet")
    public String addDetails(){

        int a=12;
        int b=12;

        return "Added Successfully";

    }

}
