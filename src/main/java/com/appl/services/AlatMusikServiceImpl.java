package com.appl.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.appl.model.AlatMusik;
import com.appl.repositories.AlatMusikRepository;
 
@Service("alatMusikService")
public class AlatMusikServiceImpl implements AlatMusikService {
 
    @Autowired
    AlatMusikRepository alatMusikRepo;
 
    @Override
    public void create(AlatMusik alatMusik) {
    	AlatMusik alat = alatMusikRepo.insert(alatMusik);
        System.out.println("Created:- " + alat);
    }
 
    @Override
    public void update(AlatMusik alatMusik) {
    	AlatMusik alat = alatMusikRepo.save(alatMusik);
        System.out.println("Updated:- " + alat);
 
    }
 
    @Override
    public void delete(AlatMusik alatMusik) {
    	alatMusikRepo.delete(alatMusik);
        System.out.println("Deleted:- " + alatMusik.getId());
    }
 
    @Override
    public List <AlatMusik> findAll() {
        return alatMusikRepo.findAll();
    }
 
    @Override
    public List <AlatMusik> findByNama(String nama) {
        return alatMusikRepo.findByNama(nama);
    }
    
    @Override
    public List <AlatMusik> findByAsal(String asal) {
        return alatMusikRepo.findByAsal(asal);
    }
    
    @Override
    public List <AlatMusik> findByJenis(String jenis) {
        return alatMusikRepo.findByJenis(jenis);
    }
    
    @Override
    public List <AlatMusik> findByCara(String cara) {
        return alatMusikRepo.findByCara(cara);
    }
 
    @Override
    public void deleteAll() {
    	alatMusikRepo.deleteAll();
    }
}