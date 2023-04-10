package com.ty.hospital.controller;

import com.ty.hospital.dto.Items;
import com.ty.hospital.service.ItemsService;

public class TestSaveItems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Items items=new Items();
		ItemsService itemsService=new ItemsService();
		items.setCost(10000);
		items.setItemname("tablets");
		items.setQuantity("10g");

	}

}
