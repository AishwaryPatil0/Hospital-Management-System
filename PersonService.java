package com.ty.hospital.service;

import com.ty.hospital.dto.Person;
import com.ty.hospitaldao.imp.PersonDaoImp;

public class PersonService {

		public void savePerson(int eid,Person person) {
			PersonDaoImp daoImp=new PersonDaoImp();
			Person person2=daoImp.savePerson(eid, person);
			if(person2!=null) {
				System.out.println("data saved successfully");
			}
			else {
				System.out.println("sorry unfortunately data not saved");
			}
			
		}
		
		
		public Person getPersonsById(int pid) {
			PersonDaoImp daoImp=new PersonDaoImp();
			Person person=daoImp.getPersonsById(pid);
			if(person!=null) {
				return person;
				
			}else {
				return null;
			}
			
			
		}
		public void deletePersonById(int pid) {
			PersonDaoImp daoImp=new PersonDaoImp();
			boolean flag=daoImp.deletePersonById(pid);
			if(flag) {
				System.out.println("data deleted successfully");
			}
			else {
				System.out.println("data not deleted");
			}
			
		}
		
		
		public Person updatePersonById(int pid,Person person) {
			PersonDaoImp daoImp=new PersonDaoImp();
			Person person2=daoImp.updatePersonById(pid,person);
			if(person2!=null) {
				return person;
			}
			else {
				return null;
			}
			
		}
		
		
	}



