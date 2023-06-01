package com.skakundima.spring.mvc_hibernate_aop.services;

import com.skakundima.spring.mvc_hibernate_aop.dao.UserDAO;
import com.skakundima.spring.mvc_hibernate_aop.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


@Service
public class UsersServiceImpl implements UsersService {

    private final UserDAO userDAO;

    @Autowired
    public UsersServiceImpl (UserDAO userDao) {
        this.userDAO = userDao;
    }

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
