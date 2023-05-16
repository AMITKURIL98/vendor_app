package com.vendor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.vendor.entity.Vendor;
import com.vendor.repository.VendorRepository;

@SpringBootApplication
public class VendorAppApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(VendorAppApplication.class, args);
	}

	@Autowired
	private VendorRepository vendorRepository;
	
	
	@Override
	public void run(String... args) throws Exception {
		/*
		Vendor vendor1 = new Vendor("Amit","1234567","SBI","S.T Colony","Latur","India","413512");	
		vendorRepository.save(vendor1);
		
		Vendor vendor2 = new Vendor("Sanjay","2345671","SBI","S.T Colony","Pune","India","400512");	
		vendorRepository.save(vendor2);
		
		Vendor vendor3 = new Vendor("Golu","3456712","SBI","S.T Colony","Mumbai","India","400002");	
		vendorRepository.save(vendor3);
		*/
	}

}
