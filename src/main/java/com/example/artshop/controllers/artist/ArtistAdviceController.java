package com.example.artshop.controllers.artist;

import com.example.artshop.data.CollectionRepository;
import com.example.artshop.models.entity.Artist;
import com.example.artshop.models.entity.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;


import java.util.List;

@ControllerAdvice("com.example.artshop.controllers.artist")
public class ArtistAdviceController {

    @Autowired
    protected CollectionRepository collectionRepository;

    @ModelAttribute("collections")
    public List<Collection> getCollections(Artist artist){
        return collectionRepository.findByArtist(artist);
    }



}
