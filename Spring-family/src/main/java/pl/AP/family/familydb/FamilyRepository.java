package pl.AP.family.familydb;


import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface FamilyRepository extends CrudRepository<Family, Integer> {

  //  Family findById(int Id);
    
   @Query("SELECT ID,FAMILY_NAME,NR_OF_ADULTS,NR_OF_CHILDREN,NR_OFINFANTS FROM FAMILY WHERE ID=:id")
   Family findID(int id);


    
     
    
    
    
}
