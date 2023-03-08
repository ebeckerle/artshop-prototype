package com.example.artshop.models;


import java.util.List;

//@Entity
public class Collection {

//    @Id
//    @GeneratedValue
    private Integer id;

    private String name;

//    @ManyToMany
    private List<Artwork> artworks;

    public Integer getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Artwork> getArtworks() {
        return artworks;
    }

    public void setArtworks(List<Artwork> artworks) {
        this.artworks = artworks;
    }
}
