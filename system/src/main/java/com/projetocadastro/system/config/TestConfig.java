package com.projetocadastro.system.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.projetocadastro.system.controllers.UserController;
import com.projetocadastro.system.models.User;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserController userController;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maycon Vieira", "Maycon@gmail.com", "99999999999", "12345");

        userController.save(u1);
    }

}
