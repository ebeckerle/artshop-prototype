package com.example.artshop.controllers.artist;

import com.example.artshop.data.ArtistRepository;
import com.example.artshop.data.ArtworkRepository;
import com.example.artshop.models.dto.NewArtworkDTO;
import com.example.artshop.models.entity.Artwork;
import com.example.artshop.models.pojo.TileList;
import com.example.artshop.service.FilesStorageService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

@Controller
//@RequestMapping("/wardrobe/artwork")
@RequestMapping("/wardrobe/{artistId}/artwork")
public class ArtworkController {

    @Autowired
    FilesStorageService storageService;

    @Autowired
    ArtistRepository artistRepository;

    @Autowired
    ArtworkRepository artworkRepository;

    @GetMapping
    public String displayAllArtwork(Model model, @PathVariable("artistId") Integer artistId){
        model.addAttribute("title", "View All Artwork");

//        TileList allArtworkInTiles = new TileList("All Artwork", )
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
//    @PostMapping("/success")
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
            newArtwork.setImageFileLocation("uploads/"+file.getOriginalFilename());
            System.out.println(newArtwork.getImageFileLocation());
            message = "Uploaded the image successfully: " + file.getOriginalFilename();
            model.addAttribute("message", message);
        } catch (Exception e) {
            message = "Could not upload the image: " + file.getOriginalFilename() + ". Error: " + e.getMessage();
            model.addAttribute("message", message);
        }

        //convert the new Artwork DTO to an Artwork
        System.out.println("ARTWORK CONTROLLER");
        System.out.println(newArtwork.getProductName1());

        Artwork artwork = new Artwork(newArtwork, artistRepository.findById(artistId).get());

        System.out.println(artwork.getProducts().size());

        //save the new artwork
        artworkRepository.save(artwork);

        model.addAttribute("success", "SUCCESS!!!");

        return "artist/viewartwork";
    }


//    @PostMapping("/new")
//    public RedirectView processCreateANewArtworkForm(Model model,
//                                                     @PathVariable("artistId") Integer artistId,
//                                                     @ModelAttribute @Valid NewArtworkDTO newArtwork,
//                                                     Errors errors,
//                                                     @RequestParam("file") MultipartFile file,
//                                                     RedirectAttributes redirectAttributes){
//        model.addAttribute("title", "Create A New Artwork");
//
//        if(errors.hasErrors()){
//            model.addAttribute("title", "Create A New Artwork");
////            model.addAttribute(newArtwork);
//            redirectAttributes.addFlashAttribute(newArtwork);
//            return new RedirectView("/wardrobe/{artistId}/artwork/new", true);
//        }
//
//        //For the Image upload ...
//        String message = "";
//        try {
//            storageService.save(file);
//            newArtwork.setImageFileLocation("uploads/"+file.getOriginalFilename());
//            System.out.println(newArtwork.getImageFileLocation());
//            message = "Uploaded the image successfully: " + file.getOriginalFilename();
//            model.addAttribute("message", message);
//        } catch (Exception e) {
//            message = "Could not upload the image: " + file.getOriginalFilename() + ". Error: " + e.getMessage();
//            model.addAttribute("message", message);
//        }
//        Integer artworkId = 2;
//        redirectAttributes.addFlashAttribute("success", "SUCCESS!!!");
//
//        return new RedirectView("/wardrobe/{artistId}/artwork/"+artworkId, true);
//    }



}
