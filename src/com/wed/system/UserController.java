package com.wed.system;


import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.po.User;
import com.service.system.UserService;

@Controller
@RequestMapping("/userController")
public class UserController{
	@Resource
	private UserService uS;
	@RequestMapping(value="/longd",method= RequestMethod.POST)
	public String longi(String name,String password){
		System.out.println("s"+name+"d"+password);
		User u=new User();
		u=uS.listUser(name, password);
		if(u==null){
			return "/index";
		}		
		return "/long";
	}
	
	
}
