package com.example.crud.repositories;

import com.example.crud.models.Album;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface AlbumRepository extends MongoRepository<Album, String> {

    List<Album> findAllById(String albumId);
}

