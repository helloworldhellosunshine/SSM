package com.javen.controller;

import com.javen.model.Student;
import com.javen.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/getStudent")
    @ResponseBody
    public List<Student> getStudent(){
        List<Student> list = studentService.getStudent();
         return list;
    }

    @RequestMapping("/getStudent1")
    @ResponseBody
    public List<Student> getStudent1(){
        List<Student> list = studentService.getStudent1();
        return list;
    }



}
