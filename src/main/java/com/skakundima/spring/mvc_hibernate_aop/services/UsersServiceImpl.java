package com.skakundima.spring.mvc_hibernate_aop.services;

import com.skakundima.spring.mvc_hibernate_aop.dao.UserDAO;
import com.skakundima.spring.mvc_hibernate_aop.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

//@Component
@Service
public class UsersServiceImpl implements UsersService {

    private final UserDAO userDAO;

    @Autowired
    public UsersServiceImpl (UserDAO userDao) {
        this.userDAO = userDao;
    }

    @Override
    //@Transactional
    public List<User> findAll() {

        return userDAO.findAll();
    }

    @Override
    //@Transactional
    public User findOne(Long id) {

        return userDAO.findOne(id);
    }

    @Override
    //@Transactional
    public void save(User user) {

        userDAO.save(user);
    }

    @Override
    //@Transactional
    public void delete(Long id) {

        userDAO.delete(id);
    }

    @Override
    //@Transactional
    public void update(Long id, User user) {
        userDAO.update(id, user);
    }
}
