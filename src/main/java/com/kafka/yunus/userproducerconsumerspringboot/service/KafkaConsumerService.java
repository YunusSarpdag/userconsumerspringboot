package com.kafka.yunus.userproducerconsumerspringboot.service;

import com.kafka.yunus.userproducerconsumerspringboot.dto.UserDto;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = {"user-topic"})
    public void consumerUserData(UserDto user){
        System.out.println("name is : " + user.getName());
        System.out.println("age is : " + user.getAge());
        System.out.println("songName is : " + user.getSongName());
    }
}
