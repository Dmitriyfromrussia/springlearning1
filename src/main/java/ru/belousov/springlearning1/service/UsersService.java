package ru.belousov.springlearning1.service;


import ru.belousov.springlearning1.models.User;

import java.util.List;

public interface UsersService {

    List<User> findAll();

    void add(User user);

    void delete(User user);

    void edit(User user);

    User getById(int id);
}
