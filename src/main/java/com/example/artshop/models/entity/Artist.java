package com.example.artshop.models.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Artist {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;


    @OneToMany(cascade = CascadeType.PERSIST)
    private List<Artwork> artwork;

    @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "artist")
    private List<Collection> collections;

//    public Artist(){}

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Artwork> getArtwork() {
        return artwork;
    }

    public void setArtwork(List<Artwork> artwork) {
        this.artwork = artwork;
    }

    public List<Collection> getCollections() {
        return collections;
    }

    public void setCollections(List<Collection> collections) {
        this.collections = collections;
    }
}
