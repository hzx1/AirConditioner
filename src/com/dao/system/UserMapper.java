package com.dao.system;

import org.apache.ibatis.annotations.Param;

import com.po.User;

public interface UserMapper {
	/**
	 * 
	 * @param name
	 * @param password
	 * @return
	 */
	public User listUser(@Param("name")String name,@Param("password")String password);
}
