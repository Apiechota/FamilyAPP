package pl.AP.family.familydb;

import org.springframework.data.annotation.*;
import org.springframework.data.relational.core.mapping.Table;
@Table
public class Family {

	@Id
	private int id;
	private String familyName;
	private int nrOfAdults;
	private int nrOfChildren;
	private int nrOfinfants;
	
	
	
	
	public Family(String familyName, int nrOfAdults, int nrOfChildren, int nrOfinfants) {
		super();
		this.familyName = familyName;
		this.nrOfAdults = nrOfAdults;
		this.nrOfChildren = nrOfChildren;
		this.nrOfinfants = nrOfinfants;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFamilyName() {
		return familyName;
	}
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	public int getNrOfAdults() {
		return nrOfAdults;
	}
	public void setNrOfAdults(int nrOfAdults) {
		this.nrOfAdults = nrOfAdults;
	}
	public int getNrOfChildren() {
		return nrOfChildren;
	}
	public void setNrOfChildren(int nrOfChildren) {
		this.nrOfChildren = nrOfChildren;
	}
	public int getNrOfinfants() {
		return nrOfinfants;
	}
	public void setNrOfinfants(int nrOfinfants) {
		this.nrOfinfants = nrOfinfants;
	}
	public Family(int id, String familyName, int nrOfAdults, int nrOfChildren, int nrOfinfants) {
		super();
		this.id = id;
		this.familyName = familyName;
		this.nrOfAdults = nrOfAdults;
		this.nrOfChildren = nrOfChildren;
		this.nrOfinfants = nrOfinfants;
	}
	public Family() {
		// TODO Auto-generated constructor stub
	}
	
}
