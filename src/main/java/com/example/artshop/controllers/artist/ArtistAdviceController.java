package com.example.artshop.controllers.artist;

import com.example.artshop.models.Collection;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;


import java.util.List;

@ControllerAdvice("com.example.artshop.controllers.artist")
public class ArtistAdviceController {

    @ModelAttribute("collections")
    public List<Collection> getCollections(){
        //collectionRepository.get
    }

}
