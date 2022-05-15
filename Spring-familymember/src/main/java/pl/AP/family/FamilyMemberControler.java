package pl.AP.family;

import org.springframework.web.bind.annotation.RestController;


import pl.AP.family.familydb.FamilyMemberDTO;
import pl.AP.family.familydb.Intowa;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class FamilyMemberControler {
	
	
	private FamilyMemberService serv;
	@Autowired
	public FamilyMemberControler(FamilyMemberService serv)
	{
		this.serv=serv;
	}
	
	
	@PostMapping("/g/")
	public List<FamilyMemberDTO> SearchFamilyMember(@RequestBody Intowa id) {
		return serv.getFamilyMember(id.id);
	}

	@PostMapping("/p/")
	public String CreateFamilyMember(@RequestBody FamilyMemberDTO c) {
		return serv.createFamilyMember(c);
		
	}
}
