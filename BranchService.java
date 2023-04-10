package com.ty.hospital.service;

import com.ty.hospital.dto.Branch;
import com.ty.hospitaldao.imp.BranchDaoImp;

public class BranchService {
	public void saveBranch(int hid,Branch branch) {
		BranchDaoImp daoImp=new BranchDaoImp();
		Branch branch2=daoImp.saveBranch(hid,branch);
		if(branch2!=null) {
			System.out.println("data saved successfully");
		}
		else {
			System.out.println("sorry unfortunately data not saved");
		}

}
	public Branch getBranchDetailsById(int bid) {
		BranchDaoImp daoImp=new BranchDaoImp();
		Branch branch=daoImp.getBranchById(bid);
		if(branch!=null) {
			return branch;
			
		}else {
			return null;
		}
	
}
	public void deleteBranchById(int bid) {
		BranchDaoImp daoImp=new BranchDaoImp();
		boolean flag=daoImp.deleteBranchById(bid);
		if(flag) {
			System.out.println("data deleted successfully");
		}
		else {
			System.out.println("data not deleted");
		}
		
	}
	
	public Branch updateBranchById(int bid,Branch branch) {
		BranchDaoImp daoImp=new BranchDaoImp();
		Branch branch2=daoImp.updateBranchById(bid,branch);
		if(branch2!=null) {
			return branch2;
		}
		else {
			return null;
		}
		
	}
	
}

