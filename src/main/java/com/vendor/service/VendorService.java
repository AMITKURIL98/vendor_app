package com.vendor.service;

import java.util.List;

import com.vendor.entity.Vendor;

public interface VendorService {
	
	List<Vendor> getAllVendors();
	
	Vendor saveVendor(Vendor vendor);
	
	Vendor getVendorById(Long id);
	
	Vendor updateVendor(Vendor vendor);
	
	void deleteVendorById(Long id);

}
