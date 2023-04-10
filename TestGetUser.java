package com.ty.hospital.controller;

import com.ty.hospital.dto.User;
import com.ty.hospital.service.UserService;

public class TestGetUser{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		UserService userService=new UserService();
		User user=userService.getUserById(1);
		System.out.println("user id is:"+user.getUserid());
		System.out.println("user password is:"+user.getPassword());
		System.out.println("user email is:"+user.getEmail());
		System.out.println("user name is"+user.getName());
		System.out.println("user phno is"+user.getPhno());
		System.out.println("user rating is"+user.getRating());


	}

}
