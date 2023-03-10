package com.example.artshop.controllers.artist;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/wardrobe/collections")
//@RequestMapping("/wardrobe/{artistId}/collections")
public class CollectionsController {

    @GetMapping
    public String displayAllCollections(Model model){
        model.addAttribute("title", "View All Collections");
        return "artist/viewallcollections";
    }


}
