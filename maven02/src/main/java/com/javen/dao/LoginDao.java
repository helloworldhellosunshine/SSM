package com.javen.dao;

import com.javen.model.Login;


import java.util.List;

public interface LoginDao {

    public List<Login> login(String userName, String password);

}
