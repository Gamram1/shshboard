package com.example.shboard.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class TestController {

    @GetMapping("/home")
    public String goHome(Model model){
        log.info("반가워요");
        model.addAttribute("hello","인사말");

        return "home";
    }
}
