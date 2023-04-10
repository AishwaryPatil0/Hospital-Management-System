package com.ty.hospital.controller;

import com.ty.hospital.dto.MedOrder;
import com.ty.hospital.service.MedOrderService;

public class TestSaveMedOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MedOrder medOrder=new MedOrder();
		MedOrderService medOrderService=new MedOrderService();
		medOrder.setDname("wer");
		medOrder.setOrderdate("06-02.2023");
		medOrder.setTotal(50000);
		

	}

}