package com.ty.hospital.service;

import com.ty.hospital.dto.Hospital;
import com.ty.hospitaldao.imp.HospitalDaoImp;

public class HospitalService {
	public void saveHospital(Hospital hospital) {
		HospitalDaoImp daoImp=new HospitalDaoImp();
		Hospital hospital2=daoImp.saveHospital(hospital);
		if(hospital2!=null) {
			System.out.println("data saved successfully");
		}
		else {
			System.out.println("sorry unfortunately data not saved");
		}
		
	}
	
	public Hospital getHospitalDetailsById(int hid) {
		HospitalDaoImp daoImp=new HospitalDaoImp();
		Hospital hospital=daoImp.getHospitalById(hid);
		if(hospital!=null) {
			return hospital;
			
		}else {
			return null;
		}
		
		
	}
	public void deleteHospitalById(int hid) {
		HospitalDaoImp daoImp=new HospitalDaoImp();
		boolean flag=daoImp.deleteHospitalById(hid);
		if(flag) {
			System.out.println("data deleted successfully");
		}
		else {
			System.out.println("data not deleted");
		}
		
	}
	
	public Hospital updateHospitalById(int hid,Hospital hospital) {
		HospitalDaoImp daoImp=new HospitalDaoImp();
		Hospital hospital2=daoImp.updateHospitalById(hid,hospital);
		if(hospital2!=null) {
			return hospital2;
		}
		else {
			return null;
		}
		
	}
	

}
