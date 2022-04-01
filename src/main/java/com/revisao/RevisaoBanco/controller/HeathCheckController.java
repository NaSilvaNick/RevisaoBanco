package com.revisao.RevisaoBanco.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeathCheckController {

    @GetMapping("/heath-check")
    public String heathCheck(){
        return "Server Running!!";
    }
}
