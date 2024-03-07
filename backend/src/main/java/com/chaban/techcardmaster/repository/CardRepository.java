package com.chaban.techcardmaster.repository;

import com.chaban.techcardmaster.model.Card;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CardRepository extends MongoRepository<Card, String> {
}
