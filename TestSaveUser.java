package com.ty.hospital.controller;

import com.ty.hospital.dto.User;
import com.ty.hospital.service.UserService;

public class TestSaveUser{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user=new User();
		UserService userService=new UserService();
		user.setRating(4.5);
		user.setEmail("tejaswinikr@gmail.com");
		user.setName("teju");
		user.setPhno(935357374);
		user.setPassword(123355);
	}

}
