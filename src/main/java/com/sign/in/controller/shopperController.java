package com.sign.in.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class shopperController {

    @GetMapping("/shopperMain")
    public String index() {

        return "/shopper/shopperMain";
    }



}
