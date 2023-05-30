package com.skakundima.spring.mvc_hibernate_aop.services;

import com.skakundima.spring.mvc_hibernate_aop.models.User;

import java.util.List;

public interface UsersService {

    public List<User> findAll();

    public User findOne(Long id);

    public void save(User user);

    public void delete(Long id);

    void update(Long id, User user);
}
