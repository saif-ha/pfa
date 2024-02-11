package com.example.backend.Repo;

import com.example.backend.Entity.St;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StRepo extends MongoRepository<St,String> {
}
