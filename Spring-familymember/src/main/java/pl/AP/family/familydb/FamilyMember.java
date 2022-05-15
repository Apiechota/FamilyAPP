package pl.AP.family.familydb;

import org.springframework.data.annotation.*;
import org.springframework.data.relational.core.mapping.Table;
@Table
public class FamilyMember {

	@Id
	private int id;
	private String familyName;
	private String givenName;
	private int familyid;
	private int age;
	
	public FamilyMember() {
		super();
		// TODO Auto-generated constructor stub
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

	public String getGivenName() {
		return givenName;
	}

	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}

	public int getFamilyid() {
		return familyid;
	}

	public void setFamilyid(int familyid) {
		this.familyid = familyid;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public FamilyMember(int id, String familyName, String givenName, int familyid, int age) {
		super();
		this.id = id;
		this.familyName = familyName;
		this.givenName = givenName;
		this.familyid = familyid;
		this.age = age;
	}

	public FamilyMember(String familyName, String givenName, int familyid, int age) {
		super();
		this.familyName = familyName;
		this.givenName = givenName;
		this.familyid = familyid;
		this.age = age;
	}
	
	
}
