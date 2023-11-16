package com.enduser.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConsumerConfig {

    Logger logger = LoggerFactory.getLogger(getClass());

    @KafkaListener(topics = AppConstant.KAFKA_TOPIC, groupId = AppConstant.KAFKA_GROUP_ID)
    public void updatedLocation(String value){
        logger.info("Location updated "+value);
    }
}
