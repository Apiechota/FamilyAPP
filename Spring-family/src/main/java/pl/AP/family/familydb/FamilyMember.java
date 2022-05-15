package pl.AP.family.familydb;

public class FamilyMember {

	private String familyName;
	private String givenName;
	private int familyId;
	private int age;
	
	
	public FamilyMember(FamilyMemberDTO dto, int familyId) {
		super();
		this.familyName = dto.getFamilyName();
		this.givenName = dto.getGivenName();
		this.familyId = familyId;
		this.age=dto.getAge();
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


	public int getFamilyId() {
		return familyId;
	}


	public void setFamilyId(int familyId) {
		this.familyId = familyId;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public FamilyMember(String familyName, String givenName, int familyId, int age) {
		super();
		this.familyName = familyName;
		this.givenName = givenName;
		this.familyId = familyId;
		this.age = age;
	}
	
	
}
