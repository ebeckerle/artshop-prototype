package com.example.artshop.models.entity;

import jakarta.persistence.Entity;

@Entity
public class ProductType {

        @Id
    @GeneratedValue
    private Integer id;

    private String name;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
