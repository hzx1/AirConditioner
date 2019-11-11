package com.service.system.impl;


import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.system.UserMapper;
import com.po.User;
import com.service.system.UserService;


@Service("userService")
public class UserServiceImpl implements UserService {
	@Resource
	private UserMapper uM;
	@Override
	public User listUser(String name, String password) {
		
		return uM.listUser(name, password);
	}

	
}
