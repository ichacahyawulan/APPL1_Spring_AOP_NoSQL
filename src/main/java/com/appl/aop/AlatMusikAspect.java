package com.appl.aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AlatMusikAspect {
	@Pointcut("execution(** com.appl.services.AlatMusikService.create(..))")
	public void creating() {}
	
	@Pointcut("execution(** com.appl.services.AlatMusikService.deleteAll(..))")
	public void deletingAll() {}
	
	@Pointcut("execution(** com.appl.services.AlatMusikService.update(..))")
	public void updating() {}
	
	@Pointcut("execution(** com.appl.services.AlatMusikService.delete(..))")
	public void deleting() {}
	
	//====================create===============================
	@Before("creating()")
	public void beforeCreate() {
		System.out.println("Membuat data..");
	}
	@AfterReturning("creating()")
	public void afterCreate() {
		System.out.println("Data berhasil dibuat\n");
	}
	@AfterThrowing("creating()")
	public void failedtoCreate() {
		System.out.println("Gagal membuat data");
	}
	
	//======================delete=================================
	@Before("deleting()")
	public void beforeDelete() {
		System.out.println("Mencari data...");
		System.out.println("Data ditemukan");
	}
	@AfterReturning("deleting()")
	public void afterDelete() {
		System.out.println("Data berhasil dihapus\n");
	}
	@AfterThrowing("deleting()")
	public void failedtoDelete() {
		System.out.println("Gagal menghapus data");
	}
	
	//=======================update==========================
	@Before("updating()")
	public void beforeUpdate() {
		System.out.println("Mengupdate data...");
	}
	@AfterReturning("updating()")
	public void afterUpdate() {
		System.out.println("Data berhasil diupdate\n");
	}
	@AfterThrowing("updating()")
	public void failedtoUpdate() {
		System.out.println("Gagal mengupdate data");
	}
	
	//========================deleteAll=====================
	@Before("deletingAll()")
	public void beforeDeleteAll() {
		System.out.println("Menghapus semua data...");
	}
	@AfterReturning("deletingAll()")
	public void afterDeleteAll() {
		System.out.println("Semua data berhasil dihapus\n");
	}
	@AfterThrowing("deletingAll()")
	public void failedtoDeleteAll() {
		System.out.println("Gagal menghapus semua data");
	}
}

