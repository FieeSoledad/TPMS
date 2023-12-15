package com.huadi.project.tpms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class goLogin {
    @GetMapping({"/","/login"})
    public String login(){
        return "login";
    }
}
