package com.ty.hospital.controller;

import com.ty.hospital.dto.Items;
import com.ty.hospital.service.ItemsService;

public class TestGetItems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ItemsService itemsService=new ItemsService();
		Items items=itemsService.getItemsById(1);
		System.out.println("Item id is:"+items.getIid());
		System.out.println("Item name is"+items.getItemname());
		System.out.println("Encounter date of joining is"+items.getCost());
		System.out.println("item quantity is:"+items.getQuantity());
		

	}

}
