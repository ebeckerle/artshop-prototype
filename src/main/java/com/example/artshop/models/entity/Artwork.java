package com.example.artshop.models.entity;


import com.example.artshop.models.dto.NewArtworkDTO;
import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Artwork {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO, generator="native")
    @GenericGenerator(name = "native", strategy = "native")
    private Integer id;

    private String name;

    @ManyToOne
    private Artist artist;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Product> products;

    private String coverImage;

    @ManyToMany(cascade = CascadeType.PERSIST)
    private List<Collection> collections;

    public Artwork(NewArtworkDTO newArtworkForm, Artist artist){
        this.name = newArtworkForm.getName();
        this.artist = artist;
        List<Product> products = new ArrayList<>();
        if(newArtworkForm.getProductName1() != null){

            Product newProduct = new Product(newArtworkForm.getName(),
                    artist, newArtworkForm.getProductType1(),
                    newArtworkForm.getProductCategories1());

        }
        this.products = products;
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
