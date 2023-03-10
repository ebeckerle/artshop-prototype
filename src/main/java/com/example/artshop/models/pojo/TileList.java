package com.example.artshop.models.pojo;

import java.util.List;

public class TileList {

    private String title;

    private List<Tile> tiles;

    public TileList(String title, List<Tile> tiles){
        this.title = title;
        this.tiles = tiles;
    }
}
