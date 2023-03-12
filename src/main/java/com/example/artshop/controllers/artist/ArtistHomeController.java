package com.example.artshop.controllers.artist;

import com.example.artshop.data.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/wardrobe")
//@RequestMapping("/wardrobe/{artistId}")
public class ArtistHomeController {

//    @Autowired
//    private ArtistRepository artistRepository;

    @GetMapping
    //@GetMapping("/{artistId}")
    public String displayArtistHomePage(Model model){
//        public String displayArtistHomePage(Model model, @PathVariable Integer artistId){
//        artistRepository.findById(artistId);


        model.addAttribute("title", "Artist Home page");

        model.addAttribute("collections");
        model.addAttribute("collections", "collections");

//        model.addAttribute("collections", ArrayList<Collection> collections);
        return "artist/home";
    }
}
