package com.ty.hospital.controller;

import com.ty.hospital.dto.Person;
import com.ty.hospital.service.PersonService;

public class TestSavePerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person person=new Person();
		PersonService personService=new PersonService();
		person.setAddress("bangalore");
		person.setAge(22);
		person.setDob(05-05-1999);
		person.setEmail("www.com.com");
		person.setGender("female");
		person.setPhno(8888888);
		person.setPname("teju");

	}

}
