package com.javen.service.impl;

import com.javen.dao.TeacherDao;
import com.javen.model.Teacher;
import com.javen.service.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ITeacherServiceImpl implements ITeacherService {
    @Autowired
    private TeacherDao teacherDao;

    public List<Teacher> getTeacher() {
        return this.teacherDao.getTeacher();
    }

    public List<Teacher> getTeacher2() {
        return this.teacherDao.getTeacher2();
    }
}
