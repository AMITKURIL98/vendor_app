package com.vendor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.vendor.entity.Vendor;
import com.vendor.service.VendorService;

@Controller
public class VendorController {

	private VendorService vendorService;

	public VendorController(VendorService vendorService) {
		super();
		this.vendorService = vendorService;
	}
	
	//handler method to handle list vendor and return mode and view
	@GetMapping("/vendors")
	public String listVendor(Model model) {
		
	model.addAttribute("vendors",vendorService.getAllVendors());
	return "vendors";
    }
	
	@GetMapping("/vendors/new")
	public String createVendorForm(Model model) {
		
		//create vendor object to hold vendor form data
		Vendor vendor = new Vendor();
		model.addAttribute("vendor",vendor);
		return "create_vendor";
		
	}
	@PostMapping("/vendors")
	public String saveVendor(@ModelAttribute("vendor") Vendor vendor) {
		vendorService.saveVendor(vendor);
		return "redirect:/vendors";
		
	}
	
	@GetMapping("/vendors/edit/{id}")
	public String editVendorForm(@PathVariable Long id,Model model) {
		model.addAttribute("vendor",vendorService.getVendorById(id));
		return "edit_vendors";
		
	}
	
	@PostMapping("/vendors/{id}")
	public String updateVendor(@PathVariable Long id,@ModelAttribute("vendor") Vendor vendor,Model model) {
		
		// get vendor from database by id
		
		Vendor existingVendor = vendorService.getVendorById(id);
		
		existingVendor.setId(id);
		existingVendor.setVendor_Name(vendor.getVendor_Name());
		existingVendor.setBank_Account_No(vendor.getBank_Account_No());
		existingVendor.setBank_Name(vendor.getBank_Name());
		existingVendor.setAddress(vendor.getAddress());
		existingVendor.setCity(vendor.getCity());
		existingVendor.setCountry(vendor.getCountry());
		existingVendor.setZipCode(vendor.getZipCode());
		
		// save updated vendor object
		vendorService.updateVendor(existingVendor);
		return "redirect:/vendors";
		
		
	}
	
	//handler method to handle delete vendor method
	
	@GetMapping("/vendors/{id}")
	public String deleteVendor(@PathVariable Long id) {
		vendorService.deleteVendorById(id);
		return "redirect:/vendors";
	}
}
