package com.service.system;

import com.po.User;

public interface UserService {
	/**
	 * 
	 * @param name
	 * @param password
	 * @return
	 */
	
	public User listUser(String name,String password);
	

}
