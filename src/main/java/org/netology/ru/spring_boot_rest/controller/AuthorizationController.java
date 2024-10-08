package org.netology.ru.spring_boot_rest.controller;

import org.netology.ru.spring_boot_rest.post.Authorities;
import org.netology.ru.spring_boot_rest.service.AuthorizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AuthorizationController {
    private AuthorizationService service;

    //@Autowired
    public AuthorizationController(AuthorizationService service) {
        this.service = service;
    }


    @GetMapping("api/authorize")
    public List<Authorities> getAuthorities(@RequestParam("user") String user, @RequestParam("password") String password) {
        return service.getAuthorities(user, password);
    }
}