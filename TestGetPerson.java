package com.ty.hospital.controller;

import com.ty.hospital.dto.Person;
import com.ty.hospital.service.PersonService;

public class TestGetPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonService personService=new PersonService();
		Person person =personService.getPersonsById(1);
		System.out.println("person name is"+person.getPname());
		System.out.println("person id is"+person.getPid());
		System.out.println("person age is"+person.getAge());
		System.out.println("person address is"+person.getAddress());
		System.out.println("person dob is"+person.getDob());
		System.out.println("person email is"+person.getEmail());
		System.out.println("person phno is"+person.getPhno());
		System.out.println("person gender is"+person.getGender());

	}

}
