package com.example.artshop.models.entity;


import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;


import java.util.List;

@Entity
public class Collection {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO, generator="native")
    @GenericGenerator(name = "native", strategy = "native")
    private Integer id;

    private String name;

    @OneToMany
    private List<Artwork> artworks;

    @ManyToOne
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
