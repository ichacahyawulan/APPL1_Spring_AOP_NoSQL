package com.appl.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;
 
import com.appl.model.AlatMusik;
 
@Repository
public interface AlatMusikRepository extends MongoRepository < AlatMusik, String > {
    @Query("{ 'nama' : ?0 }")
    List < AlatMusik > findByNama(String nama);
 
    @Query(value = "{ 'asal' : ?0}")
    List < AlatMusik > findByAsal(String asal);
 
    @Query(value = "{ 'jenis' : ?0}")
    List < AlatMusik > findByJenis(String jenis);
    
    @Query(value = "{ 'cara' : ?0}")
    List < AlatMusik > findByCara(String cara);
}
