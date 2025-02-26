package com.example.demo;

import com.github.javafaker.Faker;
import org.springframework.stereotype.Component;
import org.springframework.boot.CommandLineRunner;

@Component
public class DataLoader implements CommandLineRunner {

    private final UserRepository userRepository;
    private final Faker faker;  // Vytvoríme inštanciu Fakeru

    public DataLoader(UserRepository userRepository) {
        this.userRepository = userRepository;
        this.faker = new Faker();  // Iniciálizujeme Faker
    }

    @Override
    public void run(String... args) throws Exception {
        /*// Generovanie 999 používateľov
        for (int i = 1; i <= 999; i++) {
            String name = faker.name().fullName();  // Generuje celé meno
            String email = faker.internet().emailAddress();  // Generuje e-mailovú adresu

            User user = new User();
            user.setName(name);
            user.setEmail(email);

            // Uloženie používateľa do databázy
            userRepository.save(user);
        }

        // Posledný používateľ bude Feri Pastorek
        User feri = new User();
        feri.setName("Feri Pastorek");
        feri.setEmail(faker.internet().emailAddress());  // Generovanie náhodného e-mailu

        // Uloženie Feriho do databázy
        userRepository.save(feri);

        System.out.println("1000 používateľov bolo vložených do tabuľky users, posledný sa volal Feri Pastorek.");
        */

    }
}