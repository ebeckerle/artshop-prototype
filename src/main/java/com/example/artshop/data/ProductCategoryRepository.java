package com.example.artshop.data;

import com.example.artshop.models.entity.Collection;
import com.example.artshop.models.entity.ProductCategory;
import org.springframework.data.repository.CrudRepository;

public interface ProductCategoryRepository extends CrudRepository<ProductCategory, Integer> {
}
