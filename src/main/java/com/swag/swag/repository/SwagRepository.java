package com.swag.swag.repository;

import com.swag.swag.entity.Swag;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SwagRepository  extends MongoRepository<Swag, String> {
}
