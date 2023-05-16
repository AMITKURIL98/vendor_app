package com.vendor.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "vendors")
public class Vendor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String vendor_Name;
	private String bank_Account_No;
	private String bank_Name;
	private String address;
	private String city;
	private String country;
	private String zipCode;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getVendor_Name() {
		return vendor_Name;
	}
	public void setVendor_Name(String vendor_Name) {
		this.vendor_Name = vendor_Name;
	}
	public String getBank_Account_No() {
		return bank_Account_No;
	}
	public void setBank_Account_No(String bank_Account_No) {
		this.bank_Account_No = bank_Account_No;
	}
	public String getBank_Name() {
		return bank_Name;
	}
	public void setBank_Name(String bank_Name) {
		this.bank_Name = bank_Name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	public Vendor() {
		
	}
	
	public Vendor(String vendor_Name, String bank_Account_No, String bank_Name, String address, String city,
			String country, String zipCode) {
		super();
		this.vendor_Name = vendor_Name;
		this.bank_Account_No = bank_Account_No;
		this.bank_Name = bank_Name;
		this.address = address;
		this.city = city;
		this.country = country;
		this.zipCode = zipCode;
	}
	
	

}
