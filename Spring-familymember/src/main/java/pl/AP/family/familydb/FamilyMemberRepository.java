package pl.AP.family.familydb;


import java.util.List;

import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FamilyMemberRepository extends CrudRepository<FamilyMember, Integer> {

      
	 @Query("SELECT ID,family_Name,given_name,familyid,age FROM family_member WHERE familyid = :familyid")
	List<FamilyMember> szukaj(@Param("familyid")int familyid);
    
    
}
