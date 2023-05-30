package com.skakundima.spring.mvc_hibernate_aop.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

public class UserServiceImpl {
    @Component
    public class UsersServiceImpl implements UsersService {

        @Autowired
        UserDAO userDAO;

        @Override
        public List<User> findAll() {

            return userDAO.findAll();
        }

        @Override
        public User findOne(Long id) {

            return userDAO.findOne(id);
        }

        @Override
        public void save(User user) {

            userDAO.save(user);
        }

        @Override
        public void delete(Long id) {

            userDAO.delete(id);
        }

        @Override
        public void update(Long id, User user) {
            userDAO.update(id, user);
        }
    }
}