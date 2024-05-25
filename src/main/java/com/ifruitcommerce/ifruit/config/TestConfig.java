package com.ifruitcommerce.ifruit.config;

import com.ifruitcommerce.ifruit.entities.User;
import com.ifruitcommerce.ifruit.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.ArrayList;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Eduardo", "eduardo.silva@exemplo.com", "4546546464", "edu1234");
        User u2 = new User(null, "Augusto", "augusto.souza@exemplo.com", "8494894984", "aug1234");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
