package com.appl.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "alatMusik")
public class AlatMusik {
	@Id
	private String id;
	@Field
	private String nama;
	private String asal;
	private String jenis;
	private String cara;
	
	public AlatMusik(String nama, String asal, String jenis, String cara) {
		super();
		this.nama = nama;
		this.asal = asal;
		this.jenis = jenis;
		this.cara = cara;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getAsal() {
		return asal;
	}
	public void setAsal(String asal) {
		this.asal = asal;
	}
	public String getJenis() {
		return jenis;
	}
	public void setJenis(String jenis) {
		this.jenis = jenis;
	}
	public String getCara() {
		return cara;
	}
	public void setCara(String cara) {
		this.cara = cara;
	}
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
        str.append("Id: " + getId() + ", Nama: " + getNama() + ", Asal: " + getAsal() + 
        		", Jenis: " + getJenis() + ", Cara: " + getCara());
        return str.toString();
	}
	public void printThrowException() {
		throw new IllegalArgumentException();
	}
}
