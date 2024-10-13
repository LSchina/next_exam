package com.LSchina.exam.serviceimpl;

import com.LSchina.exam.entity.Admin;
import com.LSchina.exam.entity.Student;
import com.LSchina.exam.entity.Teacher;
import com.LSchina.exam.mapper.LoginMapper;
import com.LSchina.exam.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginMapper loginMapper;

    @Override
    public Admin adminLogin(Integer username, String password) {
        return loginMapper.adminLogin(username,password);
    }

    @Override
    public Teacher teacherLogin(Integer username, String password) {
        return loginMapper.teacherLogin(username,password);
    }

    @Override
    public Student studentLogin(Integer username, String password) {
        return loginMapper.studentLogin(username,password);
    }
}
