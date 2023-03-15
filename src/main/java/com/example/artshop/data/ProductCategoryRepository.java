package com.example.artshop.data;

import com.example.artshop.models.entity.Collection;
import com.example.artshop.models.entity.ProductCategory;
import com.example.artshop.models.entity.ProductType;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductCategoryRepository extends CrudRepository<ProductCategory, Integer> {

    @Query(value = "",
            nativeQuery = true)
    List<ProductCategory> findAllProductCategoriesByArtistId(@Param("artistId") Integer artistId);

}
