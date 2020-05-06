package com.appl.main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
 
import com.appl.model.AlatMusik;
import com.appl.configuration.MongoConfig;
import com.appl.services.AlatMusikService;
 
public class App {
 
    public static void main(String args[]) {

        AbstractApplicationContext context = new AnnotationConfigApplicationContext(MongoConfig.class);
        AlatMusikService alatMusikService = (AlatMusikService) context.getBean("alatMusikService");
        //Delete all
        alatMusikService.deleteAll();
        
        //Create
        AlatMusik serune = new AlatMusik("Serune Kale", "NAD", "Aerofon", "Ditiup");
        alatMusikService.create(serune);
        
        AlatMusik aramba = new AlatMusik("Aramba", "Sumatera Utara", "Ideofon", "Dipukul");
        alatMusikService.create(aramba);
        
        AlatMusik saluang = new AlatMusik("Saluang", "Sumatera Barat", "Aerofon", "Ditiup");
        alatMusikService.create(saluang);
        
        AlatMusik gambus = new AlatMusik("Gambus", "Riau", "Kordofon", "Dipetik");
        alatMusikService.create(gambus);
        
        AlatMusik serangko = new AlatMusik("Serangko", "Riau", "Aerofon", "Ditiup");
        alatMusikService.create(serangko);
        
        AlatMusik doll = new AlatMusik("Doll", "Bengkulu", "Membranofon", "Dipukul");
        alatMusikService.create(doll);
        
        AlatMusik angklung = new AlatMusik("Angklung", "Jawa Barat", "Ideofon", "Digoyangkan");
        alatMusikService.create(angklung);
        
        AlatMusik kendang = new AlatMusik("Kendang", "Jawa Barat", "Membranofon", "Dipukul");
        alatMusikService.create(kendang);
        
        AlatMusik rebab = new AlatMusik("Rebab", "Jawa Barat", "Kordofon", "Digesek");
        alatMusikService.create(rebab);
        
        //Update
		serangko.setAsal("Jambi");
		alatMusikService.update(serangko);
		
		//Find
		System.out.println("Find All");
        List < AlatMusik > alat = alatMusikService.findAll();
        for (AlatMusik a: alat) {
            System.out.println(a);
        }
        System.out.println();
        
		System.out.println("\nFind By Nama: " + alatMusikService.findByNama(gambus.getNama()));

        System.out.println("\nFind By Asal = 'Jawa Barat'");
        List<AlatMusik> asal = alatMusikService.findByAsal("Jawa Barat");
        for (AlatMusik a: asal) {
            System.out.println(a.getNama());
        }
        
        System.out.println("\nFind By Jenis = 'Aerofon'");
        List<AlatMusik> jenis = alatMusikService.findByJenis("Aerofon");
        for (AlatMusik a: jenis) {
            System.out.println(a.getNama());
        }
        
        System.out.println("\nFind By Cara Memainkan = 'Dipukul'");
        List<AlatMusik> cara = alatMusikService.findByCara("Dipukul");
        for (AlatMusik a: cara) {
            System.out.println(a.getNama());
        }
        
        //Delete
        System.out.println();
        alatMusikService.delete(doll);
        
        alatMusikService.deleteAll();
 
        context.close();
    }
 
}
