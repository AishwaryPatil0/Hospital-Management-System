package com.ty.hospital.controller;

import com.ty.hospital.dto.MedOrder;
import com.ty.hospital.service.MedOrderService;

public class TestGetMedOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MedOrderService medOrderService=new MedOrderService();
		MedOrder  medOrder =medOrderService.getMedOrderById(1);
		System.out.println("medorder id is"+medOrder .getMid());
		System.out.println("medorder dname is"+medOrder .getDname());
		System.out.println("medoredr date is"+medOrder.getOrderdate());
		System.out.println("medorder total is"+medOrder.getTotal());

	}

}
