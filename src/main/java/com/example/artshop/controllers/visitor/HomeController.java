package com.example.artshop.controllers.visitor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
@RequestMapping
public class HomeController {

    @GetMapping
    public String displayHomePage(Model model){
        model.addAttribute("title", "Artshop Home");
        model.addAttribute("menuTitle1", "About");
        model.addAttribute("menuTitle2", "Art");
        model.addAttribute("menuTitle3", "Blog");
        return "home";
    }
}
