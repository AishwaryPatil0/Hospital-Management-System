package com.ty.hospital.controller;

import com.ty.hospital.dto.Hospital;
import com.ty.hospital.service.HospitalService;

public class TestGetHospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HospitalService hospitalService=new HospitalService();
		Hospital hospital=hospitalService.getHospitalDetailsById(1);
		System.out.println("hospital id is"+hospital.getHid());
		System.out.println("hospital name is"+hospital.getHname());
		System.out.println("hospital website is"+hospital.getWebsite());

	}

}
