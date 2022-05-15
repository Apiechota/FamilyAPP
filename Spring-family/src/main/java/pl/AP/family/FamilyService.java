package pl.AP.family;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import pl.AP.family.familydb.Family;
import pl.AP.family.familydb.FamilyDTO;
import pl.AP.family.familydb.FamilyMember;
import pl.AP.family.familydb.FamilyMemberDTO;
import pl.AP.family.familydb.FamilyRepository;
import pl.AP.family.familydb.Intowa;

@Service
public class FamilyService {


	private FamilyRepository frep ;
	@Autowired
	public FamilyService(FamilyRepository frep) {
		this.frep=frep;
	}
	
	public FamilyDTO getFamily(int id) {
		RestTemplate restTemplate = new RestTemplate(); 
	
		Family f=frep.findID(id);
		Intowa i=new Intowa(id);
		List<FamilyMemberDTO> mem=(List<FamilyMemberDTO>) restTemplate.postForObject("http://czlonkowie:8082/g/", i, ArrayList.class);
		
		return new FamilyDTO(f,mem);
	}

	public int createFamily(FamilyDTO c) {
		
		validateFamilyData(c);
		Family fa=new Family(c.getFamilyName(),c.getNrOfAdults(),c.getNrOfChildren(),c.getNrOfinfants());
		frep.save(fa);
		RestTemplate restTemplate = new RestTemplate(); 	
		for(int i=0;i<c.getMem().size();i++)
		{
			restTemplate.postForObject("http://czlonkowie:8082/p/", new FamilyMember(c.getMem().get(i),fa.getId()), String.class);
		}
		
		
		return fa.getId();
	}
	public void validateFamilyData(FamilyDTO c)
	{
		int ad=0,ch=0,in=0;
		for(int i=0;i<c.getMem().size();i++)
		{	
			if(c.getMem().get(i).getAge()<5)in++;
			if(c.getMem().get(i).getAge()>5&&c.getMem().get(i).getAge()<17)ch++;
			if(c.getMem().get(i).getAge()>16)ad++;
		}
		
		if( ad==c.getNrOfAdults()&&ch==c.getNrOfChildren()&&in==c.getNrOfinfants()) return;
		else
			throw new IllegalArgumentException(
		              "Nieodpowiednia ilość członków rodziny.");
		
	}


	
}
