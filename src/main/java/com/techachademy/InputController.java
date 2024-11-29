package com.techachademy;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class InputController {

    @GetMapping("/input")
    public String getInput() {

        return "input";

    }

}