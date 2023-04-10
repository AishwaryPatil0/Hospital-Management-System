package com.ty.hospital.controller;

import com.ty.hospital.dto.Branch;
import com.ty.hospital.service.BranchService;


public class TestGetBranch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BranchService branchService=new BranchService();
		Branch branch=branchService.getBranchDetailsById(1);
		System.out.println("Branch id is"+branch.getBid());
		System.out.println("Branch name is"+branch.getBname());
		System.out.println("Branch phno is"+branch.getPhno());
		System.out.println("Branch email is:"+branch.getEmail());


	}

}
