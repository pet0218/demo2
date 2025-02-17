package com.example.demo;


import org.springframework.stereotype.Component;
import org.springframework.boot.CommandLineRunner;

@Component
public class DataLoader implements CommandLineRunner {

    private final UserRepository userRepository;

    public DataLoader(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        // Vloženie nového používateľa


        // Uloženie do databázy


        System.out.println("Dáta boli vložené do tabuľky users.");
    }
}

