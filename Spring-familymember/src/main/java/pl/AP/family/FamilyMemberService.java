package pl.AP.family;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.AP.family.familydb.FamilyMember;
import pl.AP.family.familydb.FamilyMemberDTO;
import pl.AP.family.familydb.FamilyMemberRepository;

@Service
public class FamilyMemberService {

	
	private FamilyMemberRepository fmrep ;
	@Autowired
	public FamilyMemberService(FamilyMemberRepository fmrep) {
		this.fmrep=fmrep;
	}
	
	public List<FamilyMemberDTO> getFamilyMember(int Id) {	
	
		List<FamilyMember> fm=fmrep.szukaj(Id);
		List<FamilyMemberDTO> tmdto=new ArrayList<FamilyMemberDTO>();
		for(int i=0;i<fm.size();i++)
		{
			tmdto.add(new FamilyMemberDTO(fm.get(i)));
		}
		return tmdto;
	}

	public String createFamilyMember(FamilyMemberDTO c) {
	FamilyMember fa=new FamilyMember(c.getFamilyName(), c.getGivenName(), c.getFamilyId(),c.getAge());
	fmrep.save(fa);
	return "poszlo";
	}
	
	
}
