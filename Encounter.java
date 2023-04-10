package com.ty.hospital.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.*;

@Entity
public class Encounter {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int eid;
	private String dateofjoining;
	private String dateofdischarge;
	@OneToMany(mappedBy="encounter",cascade=CascadeType.ALL)
	private List<Observation> observation;
	@ManyToOne
	private Person person;
	@ManyToOne
	@JoinColumn
	private Branch branch;
	@OneToMany(mappedBy="encounter")
	private List<MedOrder> medorder;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getDateofjoining() {
		return dateofjoining;
	}
	public void setDateofjoining(String dateofjoining) {
		this.dateofjoining = dateofjoining;
	}
	public String getDateofdischarge() {
		return dateofdischarge;
	}
	public void setDateofdischarge(String dateofdischarge) {
		this.dateofdischarge = dateofdischarge;
	}
	public List<Observation> getObservation() {
		return observation;
	}
	public void setObservation(List<Observation> observation) {
		this.observation = observation;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public Branch getBranch() {
		return branch;
	}
	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	public List<MedOrder> getMedorder() {
		return medorder;
	}
	public void setMedorder(List<MedOrder> medorder) {
		this.medorder = medorder;
	}
	
	

}
