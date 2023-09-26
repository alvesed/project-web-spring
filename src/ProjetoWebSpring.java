package com.marcelsouzav.udemy.music.upload.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableKafka
@EnableAsync
public class ProjetoWebSpring {
    public static void main(String[] args) {
        ProjetoWebSpring.run(ProjetoWebSpring.class, args);
    }
}