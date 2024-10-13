package com.LSchina.exam.service;

import com.LSchina.exam.entity.Admin;
import com.LSchina.exam.entity.Student;
import com.LSchina.exam.entity.Teacher;

public interface LoginService {

    public Admin adminLogin(Integer username, String password);

    public Teacher teacherLogin(Integer username, String password);

    public Student studentLogin(Integer username, String password);
}
