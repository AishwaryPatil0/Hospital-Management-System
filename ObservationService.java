package com.ty.hospital.service;

import com.ty.hospital.dto.Observation;
import com.ty.hospitaldao.imp.ObservationDaoImp;

public class ObservationService {
		public void saveObservation(int eid,Observation observation) {
			ObservationDaoImp daoImp=new ObservationDaoImp();
			Observation observation2=daoImp.saveObservation(eid,observation);
			if(observation2!=null) {
				System.out.println("data saved successfully");
			}
			else {
				System.out.println("sorry unfortunately data not saved");
			}
			
		}
		
		
		public Observation getObservationById(int oid) {
			ObservationDaoImp daoImp=new ObservationDaoImp();
			Observation observation=daoImp.getObservationById(oid);
			if(observation!=null) {
				return observation;
				
			}else {
				return null;
			}
			
			
		}
		public void deleteObservationById(int oid) {
			ObservationDaoImp daoImp=new ObservationDaoImp();
			boolean flag=daoImp.deleteObservationById(oid);
			if(flag) {
				System.out.println("data deleted successfully");
			}
			else {
				System.out.println("data not deleted");
			}
			
		}
		
		
		public Observation updateObservationById(int oid,Observation observation) {
			ObservationDaoImp daoImp=new ObservationDaoImp();
			Observation observation2=daoImp.updateObservationById(oid,observation);
			if(observation2!=null) {
				return observation2;
			}
			else {
				return null;
			}
			
		}
		
		
	}


