package com.example.artshop.models;


import java.util.List;

//@Entity
public class Artwork {

    //    @Id
//    @GeneratedValue
    private Integer id;

    private String name;

    //ManytoOne
    private Artist artist;

    //    @ManyToMany
    private List<Product> products;

    //@OnetoOne
    private String coverImage;

//    @ManyToMany
    private List<Collection> collections;

    public Integer getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public String getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage;
    }

    public List<Collection> getCollections() {
        return collections;
    }

    public void setCollections(List<Collection> collections) {
        this.collections = collections;
    }
}
