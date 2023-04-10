package com.ty.hospital.controller;

import com.ty.hospital.dto.Branch;
import com.ty.hospital.service.BranchService;

public class TestSaveBranch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Branch branch=new Branch();
        BranchService branchService=new BranchService();
		branch.setBname("basavanagudi");
		branch.setEmail("www.io.com");
		branch.setPhno(914857409);

	}

}
