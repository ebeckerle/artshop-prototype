package com.example.artshop.models.pojo;

import com.example.artshop.models.entity.Artwork;
import com.example.artshop.models.entity.Collection;

import java.util.ArrayList;
import java.util.List;
public class Tile {

    private String name;

    private List<String> images;

    public  Tile (Collection collection){
        this.name = collection.getName();
        List<String> images = new ArrayList<>();
        for (Artwork artwork:
             collection.getArtworks()) {
            images.add(artwork.getCoverImage());
        }
        this.images = images;
    }

    public String getName() {
        return name;
    }

    public List<String> getImages() {
        return images;
    }
}
