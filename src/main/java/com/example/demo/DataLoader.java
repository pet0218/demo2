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
        /*for (int i = 1; i <= 500; i++) {
            String name = "User " + i;
            String email = "user" + i + "@example.com";
            User user = new User();
            user.setName(name);
            user.setEmail(email);

            // Uloženie používateľa do databázy
            userRepository.save(user);
        }*/

        // System.out.println("500 používateľov bolo vložených do tabuľky users.");
    }
}
