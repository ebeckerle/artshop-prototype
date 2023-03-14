package com.example.artshop.controllers.artist;

import com.example.artshop.data.ArtistRepository;
import com.example.artshop.data.CollectionRepository;
import com.example.artshop.models.entity.Artist;
import com.example.artshop.models.entity.Collection;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.LongAdder;

@ControllerAdvice("com.example.artshop.controllers.artist")
public class ArtistAdviceController {

    @Autowired
    private ArtistRepository artistRepository;
    @Autowired
    protected CollectionRepository collectionRepository;

//    @ModelAttribute("collections")
//    public List<Collection> getCollections(Artist artist){
//        return collectionRepository.findByArtist(artist);
//    }

//    @ModelAttribute("collections")
//    public void addCollectionsToModel(Artist artist, Model model){
//        model.addAttribute("collections", collectionRepository.findByArtist(artist));
//    }

//    @ModelAttribute("collections")
//    public List<Collection> getCollections(){
//        List collections = new ArrayList<>();
//        Collection collection = new Collection();
//        collection.setName("Earth");
//        collections.add(collection);
//        return collections;
//    }

//    private ConcurrentHashMap<String, LongAdder> counterMap = new ConcurrentHashMap<>();
//    @ModelAttribute("collections")
//    public void getCollectionsByArtistInSession(HttpServletRequest request, Model model){
////        HttpSession session = request.getSession();
////        Integer artistId = (Integer) session.getAttribute("user");
//        Integer artistId = 4;
//
//        Artist artist = artistRepository.findById(artistId).get();
//        model.addAttribute("collections", collectionRepository.findByArtist(artist));
//    }

    @ModelAttribute("collections")
    public void getCollectionsByArtistInSession(@PathVariable Integer artistId, Model model){

        Artist artist = artistRepository.findById(artistId).get();
        model.addAttribute("collections", collectionRepository.findByArtist(artist));
    }



}
