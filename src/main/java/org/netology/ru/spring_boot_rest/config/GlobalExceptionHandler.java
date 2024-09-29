package org.netology.ru.spring_boot_rest.config;

import org.netology.ru.spring_boot_rest.exeption.InvalidCredentials;
import org.netology.ru.spring_boot_rest.exeption.UnauthorizedUser;
import org.netology.ru.spring_boot_rest.repository.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Controller
public class GlobalExceptionHandler {
    @Bean
    public UserRepository user() {
        return new UserRepository();
    }

}
