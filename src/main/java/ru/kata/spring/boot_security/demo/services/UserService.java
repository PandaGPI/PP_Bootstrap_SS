package ru.kata.spring.boot_security.demo.services;

import ru.kata.spring.boot_security.demo.models.Roles;
import ru.kata.spring.boot_security.demo.models.User;

import java.util.List;
import java.util.Set;

public interface UserService {
    void saveOrUpdate(User user);

    List<User> getListUsers();

    Set<Roles> getListRoles();

    User getUserById(Long id);

    void delete(Long id);

}
