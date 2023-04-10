package com.ty.hospital.service;

import com.ty.hospital.dto.MedOrder;
import com.ty.hospitaldao.imp.MedOrderDaoImp;

public class MedOrderService {
		public void saveMedOrder(int eid,MedOrder medOrder) {
			MedOrderDaoImp daoImp=new MedOrderDaoImp();
			MedOrder medOrder2=daoImp.saveMedOrder(eid,medOrder);
			if(medOrder!=null) {
				System.out.println("data saved successfully");
			}
			else {
				System.out.println("sorry unfortunately data not saved");
			}
			
		}
		public MedOrder getMedOrderById(int mid) {
			MedOrderDaoImp daoImp=new MedOrderDaoImp();
			MedOrder medOrder=daoImp.getMedOrderById(mid);
			if(medOrder!=null) {
				return medOrder;
				
			}else {
				return null;
			}
			
			
		}
		public void deleteMedOrderById(int mid) {
			MedOrderDaoImp daoImp=new MedOrderDaoImp();
			boolean flag=daoImp.deleteMedOrderById(mid);
			if(flag) {
				System.out.println("data deleted successfully");
			}
			else {
				System.out.println("data not deleted");
			}
			
		}
		public MedOrder updateMedOrderById(int mid,MedOrder medOrder) {
			MedOrderDaoImp daoImp=new MedOrderDaoImp();
			MedOrder medOrder2=daoImp.updateMedOrderById(mid,medOrder);
			if(medOrder2!=null) {
				return medOrder2;
			}
			else {
				return null;
			}
			
		}
		
		

}
