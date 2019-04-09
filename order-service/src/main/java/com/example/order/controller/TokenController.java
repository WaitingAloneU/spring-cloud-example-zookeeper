package com.example.order.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("tokens")
public class TokenController {

    @GetMapping("create")
    public String getToken(Long userId){
        return "aelirguiwygefoazdcnvlziokdjnfhalujerglziduhvbpsiebrglauwegzld";
    }

    @GetMapping("auth")
    public Boolean authToken(String token){
        return true;
    }
}
