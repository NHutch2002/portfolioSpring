package com.example.portfolio.repository;

import com.example.portfolio.model.Reference;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReferenceRepository extends MongoRepository<Reference, String> {
}
