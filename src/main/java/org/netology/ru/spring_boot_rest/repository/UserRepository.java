package org.netology.ru.spring_boot_rest.repository;

import org.netology.ru.spring_boot_rest.post.Authorities;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class UserRepository {
    public List<Authorities> getUserAuthorities(String user, String password) {
        List<Authorities> list = new ArrayList<>();
        list.add(Authorities.valueOf(user));
        return list ;
    }
}
