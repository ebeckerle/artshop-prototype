package com.example.artshop.models;

import java.util.List;

//@Entity
public class Product {

    //    @Id
//    @GeneratedValue
    private Integer id;

    private String name;

    //    @ManyToOne
    private Artist artist;

    //@OnetoOne
    private ProductType type;

    //@ManytoMany
    private List<ProductCategory> categories;

    //@OnetoMany
//    private List<PurchaseLinks> links;

//    private Boolean forSale;


    public Integer getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public ProductType getType() {
        return type;
    }

    public void setType(ProductType type) {
        this.type = type;
    }

    public List<ProductCategory> getCategories() {
        return categories;
    }

    public void setCategories(List<ProductCategory> categories) {
        this.categories = categories;
    }
}
