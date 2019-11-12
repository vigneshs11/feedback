package com.payments.api.feedback.feedback.serviceImpl;

import com.payments.api.feedback.feedback.dao.ReviewRepository;
import com.payments.api.feedback.feedback.model.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;


public class ReviewRepositoryImpl implements  ReviewServiceImpl {

    @Autowired
    Review review;

    @Autowired
    ReviewRepository reviewRepository;
    @Autowired
    MongoTemplate mongoTemplate;

    @Override
    public String insertReview(Review review){
        this.review = review;
        Review save = reviewRepository.save(this.review);

        return "saved";
    }

}
