package pl.AP.family.familydb;

public class FamilyMemberDTO {

	private String familyName;
	private String givenName;
	private int age;
	public FamilyMemberDTO(String familyName, String givenName, int age) {
		super();
		this.familyName = familyName;
		this.givenName = givenName;
		this.age = age;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
