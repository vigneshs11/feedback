package com.payments.api.feedback.feedback.serviceImpl;

import com.payments.api.feedback.feedback.dao.ReviewRepository;
import com.payments.api.feedback.feedback.model.Review;
import com.payments.api.feedback.feedback.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

@Service
public class ReviewRepositoryImpl implements ReviewService {

    @Autowired
    Review review;

    @Autowired
    ReviewRepository reviewRepository;
    @Autowired
    MongoTemplate mongoTemplate;

    @Override
    public String getDetails(Review review){
        this.review = review;
        Review save = reviewRepository.save(this.review);

        return "saved";
    }

}
