package com.javen.controller;

import com.javen.model.Teacher;
import com.javen.service.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/teacher")
public class TeacherService {
    @Autowired
    private ITeacherService iTeacherService;

    @ResponseBody
    @RequestMapping("/getTeacher")
    public List<Teacher> getTeacher(){
        return iTeacherService.getTeacher();
    }

    @ResponseBody
    @RequestMapping("/getTeacher2")
    public List<Teacher> getTeacher2(){
        return iTeacherService.getTeacher2();
    }

}
