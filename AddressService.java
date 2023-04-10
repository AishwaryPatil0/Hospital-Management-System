package com.ty.hospital.service;

import com.ty.hospital.dto.Address;
import com.ty.hospitaldao.imp.AddressDaoImp;



public class AddressService {
	public void saveAddress(int bid,Address address) {
		AddressDaoImp daoImp=new AddressDaoImp();
		Address address2=daoImp.saveAddress(bid, address);
		if(address2!=null) {
			System.out.println("data saved successfully");
		}
		else {
			System.out.println("sorry unfortunately data not saved");
		}
		
	}
	
	
	public Address getAdressById(int aid) {
		AddressDaoImp daoImp=new AddressDaoImp();
		Address address=daoImp.getAdressById(aid);
		if(address!=null) {
			return address;
			
		}else {
			return null;
		}
		
		
	}
	public void deleteAddressById(int aid) {
		AddressDaoImp daoImp=new AddressDaoImp();
		boolean flag=daoImp.deleteAddressById(aid);
		if(flag) {
			System.out.println("data deleted successfully");
		}
		else {
			System.out.println("data not deleted");
		}
		
	}
	
	
	public Address updateAddressById(int aid,Address address) {
		AddressDaoImp daoImp=new AddressDaoImp();
		Address address2=daoImp.updateAddressById(aid,address);
		if(address2!=null) {
			return address2;
		}
		else {
			return null;
		}
		
	}
	
	
}
