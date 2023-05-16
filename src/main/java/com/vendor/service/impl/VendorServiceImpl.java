package com.vendor.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vendor.entity.Vendor;
import com.vendor.repository.VendorRepository;
import com.vendor.service.VendorService;

@Service
public class VendorServiceImpl implements VendorService {

	private VendorRepository vendorRepository;
	
	
	public VendorServiceImpl(VendorRepository vendorRepository) {
		super();
		this.vendorRepository = vendorRepository;
	}


	@Override
	public List<Vendor> getAllVendors() {
		return vendorRepository.findAll();
	}


	@Override
	public Vendor saveVendor(Vendor vendor) {
		
		return vendorRepository.save(vendor);
	}


	@Override
	public Vendor getVendorById(Long id) {
		
		return vendorRepository.findById(id).get();
	}


	@Override
	public Vendor updateVendor(Vendor vendor) {
		
		return vendorRepository.save(vendor);
	}


	@Override
	public void deleteVendorById(Long id) {
		vendorRepository.deleteById(id);
		
	}

}
