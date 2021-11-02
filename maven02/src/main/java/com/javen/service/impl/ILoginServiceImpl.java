package com.javen.service.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import com.javen.dao.LoginDao;
import com.javen.model.Login;
import com.javen.service.ILoginService;

@Service
public class ILoginServiceImpl implements ILoginService{

	@Resource
	private LoginDao loginDao;

	public Boolean ifLogin(String userName, String password, HttpServletRequest request) {

		List<Login> users = loginDao.login(userName,password);
		if (users.size() == 1){
			HttpSession session = request.getSession();
			session.setAttribute("user",users.get(0));
			return true;
		}else {
			return false;
		}
	}





}
