package com.example.artshop.data;

import com.example.artshop.models.entity.Collection;
import com.example.artshop.models.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {
}
