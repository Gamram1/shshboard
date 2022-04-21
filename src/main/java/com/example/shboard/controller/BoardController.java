package com.example.shboard.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@Slf4j
public class BoardController {

    @GetMapping("/board")
    public String goBoard(Model model){

        return "/view/boardHome";
    }
}
