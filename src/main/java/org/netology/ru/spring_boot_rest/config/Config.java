package org.netology.ru.spring_boot_rest.config;

import org.netology.ru.spring_boot_rest.controller.AuthorizationController;
import org.netology.ru.spring_boot_rest.repository.UserRepository;
import org.netology.ru.spring_boot_rest.service.AuthorizationService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public UserRepository userRepository() {
        return new UserRepository();
    }

    @Bean
    public AuthorizationService authorizationService() {
        return new AuthorizationService(userRepository());
    }

    @Bean
    public AuthorizationController authorizationController() {
        return new AuthorizationController(authorizationService());
    }
}
