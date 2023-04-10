package com.ty.hospital.controller;

import com.ty.hospital.dto.Address;
import com.ty.hospital.service.AddressService;

public class TestSaveAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address address=new Address();
		AddressService addressService=new AddressService();
		address.setCountry("india");
		address.setPin(560010);
		address.setState("karnataka");
		address.setStreet("chamarajpete");
		

	}

}
