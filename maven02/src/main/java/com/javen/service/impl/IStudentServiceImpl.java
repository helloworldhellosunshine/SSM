package com.javen.service.impl;

import com.javen.dao.StudentDao;
import com.javen.model.Student;
import com.javen.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IStudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;


    public List<Student> getStudent() {
        return this.studentDao.getStudent();
    }

    public List<Student> getStudent1() {
        return this.studentDao.getStudent1();
    }
}
