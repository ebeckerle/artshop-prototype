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


@ControllerAdvice("com.example.artshop.controllers.artist")
public class ArtistAdviceController {

    @Autowired
    private ArtistRepository artistRepository;
    @Autowired
    protected CollectionRepository collectionRepository;


//    @ModelAttribute("collections")
//    public List<Collection> getCollections(){
//        List collections = new ArrayList<>();
//        Collection collection = new Collection();
//        collection.setName("Earth");
//        collections.add(collection);
//        return collections;
//    }


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
    public void getCollectionsByArtistOnPath(@PathVariable Integer artistId, Model model){
        Artist artist = artistRepository.findById(artistId).get();
        model.addAttribute("collections", collectionRepository.findByArtist(artist));
    }



}
