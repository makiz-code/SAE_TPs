package com.example.rest_v2;

import com.example.rest_v2.entities.Adherent;
import com.example.rest_v2.repository.AdherentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RestV2Application {

    public static void main(String[] args) {
        SpringApplication.run(RestV2Application.class, args);
    }

    @Bean
    CommandLineRunner runner(AdherentRepository repository) {
        return args -> {
            repository.save(new Adherent(null, "A","B",29));
            repository.save(new Adherent(null, "A","B",29));
            repository.save(new Adherent(null, "A","B",29));
            repository.save(new Adherent(null, "A","B",29));
        };
    }

}
