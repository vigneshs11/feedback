package com.payments.api.feedback.feedback.controllers;


import com.payments.api.feedback.feedback.model.Review;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feedback")
public class controller {

      private static final Logger LOG = LoggerFactory.getLogger(Review.class);

      @GetMapping("/getfeedback")
      public String getDetails( Review review){

   return "successful";



      }



}
