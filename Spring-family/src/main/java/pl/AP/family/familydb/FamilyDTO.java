package pl.AP.family.familydb;

import java.util.ArrayList;
import java.util.List;

public class FamilyDTO {
	
	
	private String familyName;
	private int nrOfAdults;
	private int nrOfChildren;
	private int nrOfinfants;
	
	private List<FamilyMemberDTO> mem=new ArrayList<FamilyMemberDTO>();

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

	public List<FamilyMemberDTO> getMem() {
		return mem;
	}

	public void setMem(List<FamilyMemberDTO> mem) {
		this.mem = mem;
	}

	public FamilyDTO(String familyName, int nrOfAdults, int nrOfChildren, int nrOfinfants, List<FamilyMemberDTO> mem) {
		super();
		this.familyName = familyName;
		this.nrOfAdults = nrOfAdults;
		this.nrOfChildren = nrOfChildren;
		this.nrOfinfants = nrOfinfants;
		this.mem = mem;
	}
	public FamilyDTO(Family f, List<FamilyMemberDTO> mem) {
		super();
		this.familyName = f.getFamilyName();
		this.nrOfAdults = f.getNrOfAdults();
		this.nrOfChildren = f.getNrOfChildren();
		this.nrOfinfants = f.getNrOfinfants();
		this.mem = mem;
	}

	public FamilyDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
