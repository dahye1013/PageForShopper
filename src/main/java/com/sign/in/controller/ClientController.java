package com.sign.in.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@AllArgsConstructor
public class ClientController {

    @GetMapping("/clientMain")
    public String clientWeb() {

        return "/clientWebBody/clientMain";
    }

    @GetMapping("/clientLayout")
    public String clientLayout() {

        return "/clientWeb/clientLayout";
    }

    @GetMapping("/clientMypage")
    public String clientMypage() {

        return "/clientWebBody/myPage";
    }


}
