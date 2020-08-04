package com.sign.in.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@Controller
@RequestMapping("/ogani")
public class IndexController {



    @GetMapping("/index")
    public String index() {
        return "/ogani/index";
    }

    @GetMapping("/blog")
    public String blog() {
        return "/ogani/blog";
    }

    @GetMapping("/blog-details")
    public String blogDetails() {
        return "/ogani/blog-details";
    }


    @GetMapping("/checkout")
    public String checkout() {
        return "/ogani/checkout";
    }

    @GetMapping("/contact")
    public String contact() {
        return "/ogani/contact";
    }

    @GetMapping("/main")
    public String main() {
        return "/ogani/main";
    }

    @GetMapping("/shop-details")
    public String shopDetail() {
        return "/ogani/shop-details";
    }

    @GetMapping("/shop-grid")
    public String shopGrid() {
        return "/ogani/shop-grid";
    }

    @GetMapping("/shoping-cart")
    public String shopingCart() {
        return "/ogani/shoping-cart";
    }

    @GetMapping("/productSearch")
    public String productSearch() {
        return "/ogani/productSearch";
    }

    @GetMapping("/shopperRegister")
    public String register() {
        return "/ogani/register";
    }

    @GetMapping("/test")
    public String test(){
        return "/ogani/test";
    }

}
