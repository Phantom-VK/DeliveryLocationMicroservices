package com.enduser.enduser;


import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;
import static com.enduser.enduser.AppConstants.GROUP_ID;
import static com.enduser.enduser.AppConstants.LOCATION_TOPIC;

@Configuration
public class KafkaConfig {

    @KafkaListener(topics = LOCATION_TOPIC, groupId = GROUP_ID)
    public void updatedLocation(String location){
            System.out.println("Location received from kafka topic "+location);

    }
}
