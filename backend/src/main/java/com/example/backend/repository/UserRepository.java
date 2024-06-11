package com.example.backend.repository;

import com.example.backend.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.Optional;

public interface UserRepository extends MongoRepository<User, Integer> {
    Optional<User> findByUsername(String username);
}
