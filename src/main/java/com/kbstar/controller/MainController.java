package com.kbstar.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class MainController {

    @RequestMapping("/")
    public String main(Model model) {
        return "index";
    }

    @RequestMapping("/shop")
    public String shop(Model model) {
        model.addAttribute("center","shop");
        return "index";
    }

    @RequestMapping("/contact")
    public String contact(Model model) {
        model.addAttribute("center","contact");
        return "index";
    }

    @RequestMapping("/signin")
    public String signin(Model model) {
        model.addAttribute("center","signin");
        return "index";
    }

    @RequestMapping("/login")
    public String login(Model model) {
        model.addAttribute("center","login");
        return "index";
    }

    @RequestMapping("/checkout")
    public String checkout(Model model) {
        model.addAttribute("center","checkout");
        return "index";
    }

    @RequestMapping("/cart")
    public String cart(Model model) {
        model.addAttribute("center","shopping-cart");
        return "index";
    }

    @RequestMapping("/review")
    public String review(Model model) {
        model.addAttribute("center","review");
        return "index";
    }

}
