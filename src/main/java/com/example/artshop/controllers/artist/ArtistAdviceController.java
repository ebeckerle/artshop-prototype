package com.example.artshop.controllers.artist;

import com.example.artshop.data.ArtistRepository;
import com.example.artshop.data.CollectionRepository;
import com.example.artshop.data.ProductCategoryRepository;
import com.example.artshop.data.ProductTypeRepository;
import com.example.artshop.models.entity.Artist;
import com.example.artshop.models.entity.Collection;
import com.example.artshop.models.entity.ProductCategory;
import com.example.artshop.models.entity.ProductType;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;


@ControllerAdvice("com.example.artshop.controllers.artist")
public class ArtistAdviceController {

    @Autowired
    private ArtistRepository artistRepository;
    @Autowired
    protected CollectionRepository collectionRepository;

    @Autowired
    private ProductTypeRepository productTypeRepository;

    @Autowired
    private ProductCategoryRepository productCategoryRepository;


    @ModelAttribute("collections")
    public void getCollectionsByArtistOnPath(@PathVariable Integer artistId, Model model){
        Artist artist = artistRepository.findById(artistId).get();
        model.addAttribute("collections", collectionRepository.findByArtist(artist));
    }


    @ModelAttribute("productTypes")
    public void getProductTypesByArtistOnPath(@PathVariable Integer artistId, Model model){
        model.addAttribute("productTypes", productTypeRepository.findAllProductTypesByArtistId(artistId));
    }


    @ModelAttribute("productCategories")
    public void getProductCategoriesByArtistOnPath(@PathVariable Integer artistId, Model model){
        model.addAttribute("productCategories", productCategoryRepository.findAllProductCategoriesByArtistId(artistId));
    }

//    private Map
//    @ModelAttribute("navMenu")
//    public void getNavMenuOptionsForArtistOnPath(@PathVariable Integer artistId,
//                                                 @ModelAttribute("collections") List<Collection> collections,
//                                                 @ModelAttribute("productTypes") List<ProductType> productTypes,
//                                                 @ModelAttribute("productCategories") List<ProductCategory> productCategories,
//                                                 Model model){
//        ModelMap modelMap = new ModelMap(collections);
//        modelMap.addAttribute(productTypes);
//        modelMap.addAttribute(productCategories);
//    }


}
