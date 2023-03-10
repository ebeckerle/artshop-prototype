package com.example.artshop.data;

import com.example.artshop.models.entity.ProductType;
import org.springframework.data.repository.CrudRepository;

public interface ProductTypeRepository extends CrudRepository<ProductType, Integer> {
}
