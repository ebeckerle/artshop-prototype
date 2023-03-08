package com.example.artshop.controllers.artist;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/wardrobe")
public class ArtistHomeController {

    @GetMapping
    public String displayArtistHomePage(Model model){
        model.addAttribute("title", "Artist Home page");
        return "artist/home";
    }
}
