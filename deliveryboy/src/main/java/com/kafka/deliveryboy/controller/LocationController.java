package com.kafka.deliveryboy.controller;

import com.kafka.deliveryboy.service.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/location")
public class LocationController {

    @Autowired
    private KafkaService kafkaService;

    @PostMapping("/update")
    public ResponseEntity<?> updateLocation(){
        this.kafkaService.updateLocation("("+Math.round(Math.random()*100)+","+Math.round(Math.random()*100)+")");

        return ResponseEntity.ok("Location Updated");

    }
}
