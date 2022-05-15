package pl.AP.family;

import org.springframework.web.bind.annotation.RestController;

import pl.AP.family.familydb.FamilyDTO;
import pl.AP.family.familydb.Intowa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class FamilyControler {
	
	
	private FamilyService serv;
	@Autowired
	public FamilyControler(FamilyService serv)
	{
		this.serv=serv;
	}
	
	//@RequestParam
	@PostMapping("/g/")
	public FamilyDTO GetFamily(@RequestBody Intowa id) {

		return serv.getFamily(id.id);
	}

	@PostMapping("/p/")
	public int CreateFamily(@RequestBody FamilyDTO c) {
		
		return serv.createFamily(c);
	}
	
}
