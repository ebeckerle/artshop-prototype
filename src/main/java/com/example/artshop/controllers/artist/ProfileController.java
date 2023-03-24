package com.example.artshop.controllers.artist;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/wardrobe/{artistId}/profile")
public class ProfileController {

    @GetMapping("/edit")
    public String displayEditArtistProfile(Model model){
        return "editprofile";
    }

    @GetMapping("/template/edit")
    public String displayEditArtistsViewTemplateChoices(Model model){
        return "edittemplate";
    }
}
