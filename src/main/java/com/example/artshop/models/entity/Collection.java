package com.example.artshop.models.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.ManyToMany;
import org.springframework.data.annotation.Id;
import javax.persistence.*;

import java.util.List;

@Entity
public class Collection {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    @ManyToMany
    private List<Artwork> artworks;

    @ManytoOne
    private Artist artist;

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

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }
}
