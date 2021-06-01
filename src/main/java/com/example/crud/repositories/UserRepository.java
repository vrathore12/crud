package com.example.crud.repositories;

import com.example.crud.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

    List<User> findAllById(String userId);

    List<User> findAllByName(String name);
}
