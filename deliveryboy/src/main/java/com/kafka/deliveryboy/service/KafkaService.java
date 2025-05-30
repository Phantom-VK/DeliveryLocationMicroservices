package com.kafka.deliveryboy.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import static com.kafka.deliveryboy.config.AppConstants.LOCATION_TOPIC;

@Service
public class KafkaService {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    private final Logger logger = LoggerFactory.getLogger(KafkaService.class);

    public void updateLocation(String location){


            this.kafkaTemplate.send(LOCATION_TOPIC, location);


        logger.info("Location sent to kafka topic {}", location);

    }
}
