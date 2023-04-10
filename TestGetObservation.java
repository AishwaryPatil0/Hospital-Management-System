package com.ty.hospital.controller;

import com.ty.hospital.dto.Observation;
import com.ty.hospital.service.ObservationService;

public class TestGetObservation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ObservationService observationService=new ObservationService();
		Observation  observation =observationService.getObservationById(1);
		System.out.println("observation id is"+observation.getOid());
		System.out.println("observation name is:"+observation.getDname());
		System.out.println("observation reservation is"+observation.getR_observation());

	}

}
