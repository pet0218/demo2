package com.example.demo;

import com.github.javafaker.Faker;
import org.springframework.stereotype.Component;
import org.springframework.boot.CommandLineRunner;

@Component
public class DataLoaderTesting implements CommandLineRunner {

    private final TestUserRepository userRepository;
    private final Faker faker;  // Vytvoríme inštanciu Fakeru

    public DataLoaderTesting(TestUserRepository userRepository) {
        this.userRepository = userRepository;
        this.faker = new Faker();  // Iniciálizujeme Faker
    }

    @Override
    public void run(String... args) throws Exception {
        // Generovanie 999 používateľov
        /*//
        for (int i = 1; i <= 999; i++) {
            String name = faker.name().fullName();  // Generuje celé meno
            String email = faker.internet().emailAddress();  // Generuje e-mailovú adresu

            TestUser user = new TestUser();
            user.setName(name);
            user.setEmail(email);

            // Uloženie používateľa do databázy
            userRepository.save(user);
        }

        // Posledný používateľ bude Feri Pastorek


        System.out.println("1000 používateľov bolo vložených do tabuľky users, posledný sa volal Feri Pastorek.");
*/

    }
}