package com.example.artshop.models.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import org.springframework.data.annotation.Id;


import java.util.List;

@Entity
public class Artist {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;


    @OnetoMany
    private List<Artwork> artwork;

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
}
