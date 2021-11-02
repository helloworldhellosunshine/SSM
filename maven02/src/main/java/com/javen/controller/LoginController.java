package com.javen.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.javen.model.Login;
import com.javen.service.ILoginService;

@Controller  //返回指定页面
@RequestMapping("/login") 
public class LoginController {

	@Autowired
	private ILoginService loginService;

    // /user/test?id=1
    @RequestMapping(value="/back", method=RequestMethod.GET)
    public String test(HttpServletRequest request,Model model){
        return "back";
    }

    @ResponseBody
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login(HttpServletRequest request){
    	String userName = request.getParameter("userName");
    	String password = request.getParameter("password");
		System.out.println(userName + " " + password);
		if (loginService.ifLogin(userName,password,request)){
			return  "{\"data\":\"登录成功\"}";
		}else {
			return  "{\"data\":\"登录失败\"}";
		}
	}


}









