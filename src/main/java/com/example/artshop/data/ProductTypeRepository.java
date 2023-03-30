package com.example.artshop.data;

import com.example.artshop.models.entity.ProductType;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Calendar;
import java.util.List;

public interface ProductTypeRepository extends CrudRepository<ProductType, Integer> {



//    @Query(value = "SELECT name FROM product_type WHERE id=(SELECT type_id FROM product WHERE artist_id= :artistId)",
//            nativeQuery = true)
//    List<String> findAllProductTypeNamesByArtistId(@Param("artistId") Integer artistId);

    @Query(value = "SELECT * FROM product_type WHERE id IN (SELECT type_id FROM product WHERE artist_id= :artistId)",
            nativeQuery = true)
    List<ProductType> findAllProductTypesByArtistId(@Param("artistId") Integer artistId);


}
