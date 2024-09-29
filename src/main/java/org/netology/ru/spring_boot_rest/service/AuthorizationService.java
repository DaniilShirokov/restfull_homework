package org.netology.ru.spring_boot_rest.service;

import org.netology.ru.spring_boot_rest.exeption.InvalidCredentials;
import org.netology.ru.spring_boot_rest.exeption.UnauthorizedUser;
import org.netology.ru.spring_boot_rest.post.Authorities;
import org.netology.ru.spring_boot_rest.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AuthorizationService {
    private UserRepository userRepository;

    public List<Authorities> getAuthorities(String user, String password) {
        if (isEmpty(user) || isEmpty(password)) {
            throw new InvalidCredentials("User name or password is empty");
        }
        List<Authorities> userAuthorities = userRepository.getUserAuthorities(user, password);
        if (isEmpty(userAuthorities)) {
            throw new UnauthorizedUser("Unknown user " + user);
        }
        return userAuthorities;
    }

    private boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }

    private boolean isEmpty(List<?> str) {
        return str == null || str.isEmpty();
    }
}
