package com.ty.hospital.controller;

import com.ty.hospital.dto.Encounter;
import com.ty.hospital.service.EncounterService;

public class TestSaveEncounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encounter encounter=new Encounter();
		EncounterService encounterService=new EncounterService();
		encounter.setDateofdischarge("18-02-2023");
	    encounter.setDateofjoining("06-02-2023");

	}

}
