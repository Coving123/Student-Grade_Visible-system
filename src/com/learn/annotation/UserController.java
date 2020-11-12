package com.learn.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("userController")
public class UserController {

	@Autowired
//	@Resource(name="userService")
	private UserService userService;
	
	public void Do() {
		this.userService.Do();
		System.out.println("userContorller doing ringht here!");
	}
}
