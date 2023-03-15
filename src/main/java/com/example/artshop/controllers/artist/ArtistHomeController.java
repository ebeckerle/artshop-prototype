package com.example.artshop.controllers.artist;

import com.example.artshop.data.ArtistRepository;
import com.example.artshop.data.CollectionRepository;
import com.example.artshop.models.entity.Artist;
import com.example.artshop.models.entity.Collection;
import com.example.artshop.models.entity.ProductCategory;
import com.example.artshop.models.entity.ProductType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
//@RequestMapping("/wardrobe")
@RequestMapping("/wardrobe/{artistId}")
public class ArtistHomeController {

    @Autowired
    private ArtistRepository artistRepository;

    @Autowired
    private CollectionRepository collectionRepository;

//    @GetMapping
//    //@GetMapping("/{artistId}")
////    public String displayArtistHomePage(Model model){
//        public String displayArtistHomePage(Model model, @PathVariable Integer artistId){
////        artistRepository.findById(artistId);
////        Artist artist = new Artist();
////        collectionRepository.findByArtist(artist);
//
//
//        model.addAttribute("title", "Artist Home page");
//
////        model.addAttribute("collections");
////        model.addAttribute("collections", "collections");
//
//        Artist artist = artistRepository.findById(artistId).get();
//        model.addAttribute("collections", collectionRepository.findByArtist(artist));
//
////        model.addAttribute("collections", ArrayList<Collection> collections);
//        return "artist/home";
//    }


    @GetMapping
    public String displayArtistHomePage(Model model, @PathVariable Integer artistId,
                                        @ModelAttribute("collections") List<Collection> collections,
                                        @ModelAttribute("productTypes") List<ProductType> productTypes,
                                        @ModelAttribute("productCategories") List<ProductCategory> productCategories){

        model.addAttribute("title", "Artist Home page");

        return "artist/home";
    }


//    @GetMapping
//    public String displayArtistHomePage(Model model, @PathVariable Integer artistId,
//                                        @ModelAttribute("navMenu") ModelMap modelMap){
//
//        model.addAttribute("title", "Artist Home page");
//
//        return "artist/home";
//    }
}
