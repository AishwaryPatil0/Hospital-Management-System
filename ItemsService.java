package com.ty.hospital.service;


import com.ty.hospital.dto.Items;
import com.ty.hospitaldao.imp.ItemsDaoImp;

public class ItemsService {
	public void saveItems(int mid,Items items) {
		ItemsDaoImp daoImp=new ItemsDaoImp();
		Items items2=daoImp.saveItems(mid,items);
		if(items2!=null) {
			System.out.println("data saved successfully");
		}
		else {
			System.out.println("sorry unfortunately data not saved");
		}
		
	}
	public Items  getItemsById(int iid) {
		ItemsDaoImp daoImp=new ItemsDaoImp();
		Items items=daoImp.getItemsById(iid);
		if(items!=null) {
			return items;
			
		}else {
			return null;
		}
		
		
	}
	public void deleteItemsById(int iid) {
		ItemsDaoImp daoImp=new ItemsDaoImp();
		boolean flag=daoImp.deleteItemsById(iid);
		if(flag) {
			System.out.println("data deleted successfully");
		}
		else {
			System.out.println("data not deleted");
		}
		
	}
	public Items  updateItemsById(int iid,Items items) {
		ItemsDaoImp daoImp=new ItemsDaoImp();
		Items items2=daoImp.updateItemsById(iid,items);
		if(items2!=null) {
			return items2;
		}
		else {
			return null;
		}
		
	}
	

}
