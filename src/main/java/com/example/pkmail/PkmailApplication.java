package com.example.pkmail;

import com.example.pkmail.repository.PakmailRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PkmailApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(PkmailApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {


    }
}
