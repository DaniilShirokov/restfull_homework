package org.netology.ru.spring_boot_rest.repository;

import org.netology.ru.spring_boot_rest.post.Authorities;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;
@Repository
public class UserRepository {
    public List<Authorities> getUserAuthorities(String user, String password) {
        if ("admin".equals(user) && "admin123".equals(password)) {
            return List.of(Authorities.READ, Authorities.WRITE, Authorities.DELETE);
        }
        return Collections.emptyList();
    }
}
