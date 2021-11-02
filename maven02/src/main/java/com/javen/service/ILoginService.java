package com.javen.service;

import java.util.List;

import com.javen.model.Login;

import javax.servlet.http.HttpServletRequest;


public interface ILoginService {

	 Boolean ifLogin(String userName, String password, HttpServletRequest request);


}
