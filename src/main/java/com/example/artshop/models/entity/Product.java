package com.example.artshop.models.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.List;

@Entity
public class Product {

        @Id
    @GeneratedValue
    private Integer id;

    private String name;

    //    @ManyToOne
    private Artist artist;

    //@OnetoOne(cascade = CascadeType.PERSIST)
    private ProductType type;

    //@ManytoMany(cascade = CascadeType.PERSIST)
    private List<ProductCategory> categories;

    //@OnetoMany(cascade = CascadeType.ALL)
//    private List<PurchaseLinks> links;

//    private Boolean forSale;


    public Product(String name, Artist artist, ProductType type, List<ProductCategory> categories) {
        this.name = name;
        this.artist = artist;
        this.type = type;
        this.categories = categories;
    }

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
