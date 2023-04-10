package com.ty.hospital.service;

import com.ty.hospital.dto.Encounter;
import com.ty.hospitaldao.imp.EncounterDaoImp;

public class EncounterService {
	public void saveEncounter(int bid,int pid,Encounter encounter) {
		EncounterDaoImp daoImp=new EncounterDaoImp();
		Encounter encounter2=daoImp.saveEncounter(bid,pid,encounter);
		if(encounter2!=null) {
			System.out.println("data saved successfully");
		}
		else {
			System.out.println("sorry unfortunately data not saved");
		}
	}
	public Encounter getEncounterById(int eid) {
		EncounterDaoImp daoImp=new EncounterDaoImp();
		Encounter encounter=daoImp.getEncounterById(eid);
		if(encounter!=null) {
			return encounter;
			
		}else {
			return null;
		}

}
	
	
	
	public void deleteEncounterById(int eid) {
		EncounterDaoImp daoImp=new EncounterDaoImp();
		boolean flag=daoImp.deleteEncounterById(eid);
		if(flag) {
			System.out.println("data deleted successfully");
		}
		else {
			System.out.println("data not deleted");
		}
		
	}
	
	public Encounter updateEncounterById(int eid,Encounter encounter) {
		EncounterDaoImp daoImp=new EncounterDaoImp();
		Encounter encounter2=daoImp.updateEncounteById(eid,encounter);
		if(encounter2!=null) {
			return encounter;
		}
		else {
			return null;
		}
		
	}
}
