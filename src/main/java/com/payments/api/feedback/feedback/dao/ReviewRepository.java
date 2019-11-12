package com.payments.api.feedback.feedback.dao;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.payments.api.feedback.feedback.model.Review;

public interface ReviewRepository extends MongoRepository<Review, Long>{

      Review findByProductId(String productId);


}
