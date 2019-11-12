package com.payments.api.feedback.feedback.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "review")
public class Review {





    public Review(String productId, String reivew, Integer rating, String userName) {
        this.productId = productId;
        this.reivew = reivew;
        this.rating = rating;
        this.userName = userName;
    }



    @Override
    public String toString() {
        return "Review{" +
                "productId='" + productId + '\'' +
                ", reivew='" + reivew + '\'' +
                ", rating=" + rating +
                ", userName='" + userName + '\'' +
                '}';
    }

    @Id
    private String productId;
    private  String reivew;
    private Integer rating;
    private String userName;






}
