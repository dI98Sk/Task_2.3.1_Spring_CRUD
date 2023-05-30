package com.skakundima.spring.mvc_hibernate_aop.models;

import java.util.List;

public class User {

    public List<User> findAll();

    public User findOne(Long id);

    public void save(User user);

    public void delete(Long id);

    void update(Long id, User user);
}