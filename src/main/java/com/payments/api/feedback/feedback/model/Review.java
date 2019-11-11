package com.payments.api.feedback.feedback.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

public class Review {

    String reivew;
    Integer rating;
    String userName;

    @Id
    String userId;

}
