package com.mycompany;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.sql.SQLOutput;


@Controller
class MainController {

    @GetMapping("")
    public String showHomePage(){

        return "index";
    }
}
