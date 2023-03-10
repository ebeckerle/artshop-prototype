package com.example.artshop.models.entity;


import java.util.List;

//@Entity
public class ProductCategory {

    //    @Id
//    @GeneratedValue
    private Integer id;

    private String name;

//    @ManyToMany
    private List<Product> products;

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
}
