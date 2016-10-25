package com.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.bean.User;
import com.ssm.mapper.UserMapper;
import com.ssm.service.UserService;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

	public void getUserList() {
		
		List<User> listUser = userMapper.getUserList();
        System.out.println(listUser);
	}
}
