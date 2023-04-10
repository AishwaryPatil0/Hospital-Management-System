package com.ty.hospital.dto;
import java.util.*;
import javax.persistence.*;
@Entity
public class Hospital {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int hid;
	private String hname;
	@OneToMany(cascade=CascadeType.ALL,mappedBy="hospital")
	private String website;
	private List<Branch> branch;
	public int getHid() {
		return hid;
	}
	public void setHid(int 
			hid) {
		this.hid = hid;
	}
	public String getHname() {
		return hname;
	}
	public void setHname(String hname) {
		this.hname = hname;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public List<Branch> getBranch() {
		return branch;
	}
	public void setBranch(List<Branch> branch) {
		this.branch = branch;
	}
	

}
