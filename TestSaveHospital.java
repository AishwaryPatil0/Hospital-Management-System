package com.ty.hospital.controller;

import com.ty.hospital.dto.Hospital;
import com.ty.hospital.service.HospitalService;

public class TestSaveHospital{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hospital hospital=new Hospital();
		HospitalService hospitalService=new HospitalService();
		hospital.setHname("apollo");
		hospital.setWebsite("www.apollo.com");
		hospitalService.saveHospital(hospital);

	}

}
