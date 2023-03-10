package com.example.artshop.controllers.artist;

import com.example.artshop.models.dto.NewArtworkDTO;
import com.example.artshop.service.FilesStorageService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@Controller
//@RequestMapping("/wardrobe/artwork")
@RequestMapping("/wardrobe/{artistId}/artwork")
public class ArtworkController {

    @Autowired
    FilesStorageService storageService;

    @GetMapping
    public String displayAllArtwork(Model model, @PathVariable("artistId") Integer artistId){
        model.addAttribute("title", "View All Artwork");
        return "artist/viewallartwork";
    }

    @GetMapping("/{artworkId}")
    public String displayAnArtwork(Model model, @PathVariable("artistId") Integer artistId, @PathVariable("artworkId") Integer artworkId){
        model.addAttribute("title", "View All Artwork");
        return "artist/viewartwork";
    }

    @GetMapping("/new")
    public String displayCreateANewArtworkForm(Model model,
                                               @PathVariable("artistId") Integer artistId){
        model.addAttribute("title", "Create A New Artwork");
        model.addAttribute(new NewArtworkDTO());
        return "artist/newartwork";
    }

    @GetMapping("/edit/{artworkId}")
    public String displayEditAnArtworkForm(Model model,
                                           @PathVariable("artistId") Integer artistId,
                                           @PathVariable("artworkId") Integer artworkId){
        model.addAttribute("title", "Edit An Artwork");
        return "artist/editartwork";
    }

    @PostMapping("/new")
//    @PostMapping("/new/{artworkId}")
    //not sure how I am going to do this - need that artwork path variable that is just newly
    // created to render the view, so maybe a th:action is necessary? or also should I use a redirect view?
    public String processCreateANewArtworkForm(Model model,
                                               @PathVariable("artistId") Integer artistId,
                                               @ModelAttribute @Valid NewArtworkDTO newArtwork,
                                               Errors errors,
                                               @RequestParam("file") MultipartFile file){
        model.addAttribute("title", "Create A New Artwork");

        if(errors.hasErrors()){
            model.addAttribute("title", "Create A New Artwork");
            model.addAttribute(newArtwork);
            return "artist/newartwork";
        }

        //For the Image upload ...
        String message = "";
        try {
            storageService.save(file);
            message = "Uploaded the image successfully: " + file.getOriginalFilename();
            model.addAttribute("message", message);
        } catch (Exception e) {
            message = "Could not upload the image: " + file.getOriginalFilename() + ". Error: " + e.getMessage();
            model.addAttribute("message", message);
        }

        return "artist/viewartwork";
    }




}
