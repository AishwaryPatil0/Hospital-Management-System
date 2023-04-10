package com.ty.hospital.controller;

import com.ty.hospital.dto.Encounter;
import com.ty.hospital.service.EncounterService;

public class TestGetEncounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EncounterService encounterService=new EncounterService();
		Encounter encounter=encounterService.getEncounterById(1);
		System.out.println("Encounter id is"+encounter.getEid());
		System.out.println("Encounter date of discharge is"+encounter.getDateofdischarge());
		System.out.println("Encounter date of joining is"+encounter.getDateofjoining());
		

	}

}
