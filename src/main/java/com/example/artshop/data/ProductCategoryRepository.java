package com.example.artshop.data;

import com.example.artshop.models.entity.ProductCategory;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductCategoryRepository extends CrudRepository<ProductCategory, Integer> {

    @Query(value = "SELECT * FROM product_category WHERE id IN (SELECT product_category_id FROM product_category_products WHERE products_id IN (SELECT id FROM product WHERE artist_id= :artistId))",
            nativeQuery = true)
    List<ProductCategory> findAllProductCategoriesByArtistId(@Param("artistId") Integer artistId);

}
