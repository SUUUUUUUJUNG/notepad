package com.example.notepad.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NotepadController {

    @GetMapping("/")
    public String index(){
        return "index";
    }
}
