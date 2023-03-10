package com.example.artshop.data;

import com.example.artshop.models.entity.Artist;
import com.example.artshop.models.entity.Collection;
import org.springframework.data.repository.CrudRepository;

public interface ArtistRepository extends CrudRepository<Artist, Integer> {
}
