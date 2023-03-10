package com.example.artshop.data;

import com.example.artshop.models.entity.Artwork;
import com.example.artshop.models.entity.Collection;
import org.springframework.data.repository.CrudRepository;

public interface ArtworkRepository extends CrudRepository<Artwork, Integer> {
}
