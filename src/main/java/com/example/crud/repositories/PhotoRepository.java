package com.example.crud.repositories;

import com.example.crud.models.Photo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PhotoRepository extends MongoRepository<Photo, String> {

    List<Photo> findAllById(String id);
}
