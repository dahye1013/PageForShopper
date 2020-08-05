package com.sign.in.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class shopperController {

    @GetMapping("/shopperMain")
    public String shopperMain() {

        return "/shopper/shopperMain";
    }
/*
    @GetMapping("/shopperChangePwd")
    public String shopperChangePwd() {

        return "/shopper/shopperChangePwd";
    }
    @GetMapping("/shopperChatting")
    public String shopperChatting() {

        return "/shopper/shopperChatting";
    }
    @GetMapping("/shopperMypage")
    public String shopperMypage() {

        return "/shopper/shopperMypage";
    }
    @GetMapping("/shopperWithdrawal")
    public String shopperWithdrawal() {

        return "/shopper/shopperWithdrawal";
    }

    @GetMapping("/adminMain")
    public String admin() {

        return "/admin/adminMain";
    }
*/



}
