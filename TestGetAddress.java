package com.ty.hospital.controller;

import com.ty.hospital.dto.Address;
import com.ty.hospital.service.AddressService;

public class TestGetAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddressService addressService=new AddressService();
		Address address=addressService.getAdressById(1);
		System.out.println("hospital id is"+address.getAid());
		System.out.println("hospital name is"+address.getPincode());
		System.out.println("hospital website is"+address.getState());


	}

}
