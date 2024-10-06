package com.example.portfolio.repository;

import com.example.portfolio.model.Work;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface WorkRepository extends MongoRepository<Work, String> {
}
