package com.javen.controller;

import com.javen.model.User;
import com.javen.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private  UserService userService;


    @RequestMapping("/insert")
    @ResponseBody
    public Map<String,Object> insert(User user){
        System.out.println(user.toString());
        Map<String,Object> map = new HashMap<String, Object>();
        int insert = userService.insert(user);
        if (insert == 1){
            map.put("status",0);
        }else {
            map.put("status",1);
        }
        return map;
    }

    @RequestMapping("/deleteById")
    @ResponseBody
    public  Map<String,Object>  deleteById(HttpServletRequest request){
        String id = request.getParameter("id");
        Integer integerId = Integer.valueOf(id);
        System.out.println("integerId="+integerId);
        int code = userService.deleteById(integerId);
        Map<String,Object> map = new HashMap<String, Object>();
        if (code == 1){
            map.put("status",0);
        }else {
            map.put("status",1);
        }
        return map;
    }


    @RequestMapping("/update")
    @ResponseBody
    public  Map<String,Object> update(User user){
        System.out.println(user.toString());
        Map<String,Object> map = new HashMap<String, Object>();
        int code = userService.update(user);
        if (code == 1){
            map.put("status",0);
        }else {
            map.put("status",1);
        }
        return map;
    }

    @RequestMapping("/findAll")
    @ResponseBody
    public Map<String,Object> findAll(Integer page,Integer limit){
        System.out.println("page="+page + " " +"limit="+limit);
        List<User> users = userService.findAll(page,limit);

        Map<String,Object> map = new HashMap<String, Object>();
        map.put("rows",users);
        map.put("count",100);
        map.put("massage","成功");
        map.put("status","0");
        return map;
    }

    @RequestMapping("/selectCount")
    @ResponseBody
    public Map<String,Object> selectCount(){
        int count = userService.selectCount();
        System.out.println("count="+count);
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("count",count);
        return map;
    }





}
