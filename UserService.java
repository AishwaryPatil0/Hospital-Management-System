package com.ty.hospital.service;

import com.ty.hospital.dto.User;
import com.ty.hospitaldao.imp.UserDaoImp;

public class UserService {
		public void saveUser(User user) {
			UserDaoImp daoImp=new UserDaoImp();
			User user2=daoImp.saveUser(user);
			if(user2!=null) {
				System.out.println("data saved successfully");
			}
			else {
				System.out.println("sorry unfortunately data not saved");
			}
			
		}
		
		
		public User getUserById(int useridid) {
			UserDaoImp daoImp=new UserDaoImp();
			User user=daoImp.getUserById(useridid);
			if(user!=null) {
				return user;
				
			}else {
				return null;
			}
			
			
		}
		public void deleteUserById(int useridid) {
			UserDaoImp daoImp=new UserDaoImp();
			boolean flag=daoImp.deleteUserById(useridid);
			if(flag) {
				System.out.println("data deleted successfully");
			}
			else {
				System.out.println("data not deleted");
			}
			
		}
		
		
		public User updateUserById(int useridid,User user) {
			UserDaoImp daoImp=new UserDaoImp();
			User user2=daoImp.updateUserById(useridid,user);
			if(user2!=null) {
				return user2;
			}
			else {
				return null;
			}
			
		}
		
		
	}


