package com.kafka.deliveryboy.controller;

import com.kafka.deliveryboy.service.KafkaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private final Logger logger = LoggerFactory.getLogger(KafkaService.class);

    @PostMapping("/update")
    public ResponseEntity<?> updateLocation(){

        for(int i=0;i<100000;i++) {
            String location = "(" + Math.round(Math.random() * 100) + "," + Math.round(Math.random() * 100) + ")";
            this.kafkaService.updateLocation(location);
            this.logger.info("Location sent to kafka topic {}", location);
        }

        return ResponseEntity.ok("Location Updated");

    }
}
