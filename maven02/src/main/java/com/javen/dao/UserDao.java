package com.javen.dao;

import com.javen.model.User;

import java.util.List;

public interface UserDao {

    List<User> findAll(int pageInteger, int limitInteger);


    int deleteById(Integer id);

    int insert(User user);

    int update(User user);

    int selectCount();
}
