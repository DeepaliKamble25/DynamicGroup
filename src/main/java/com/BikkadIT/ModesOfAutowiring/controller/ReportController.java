package com.BikkadIT.ModesOfAutowiring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.BikkadIT.ModesOfAutowiring.service.ReportService;
@Controller
public class ReportController {
	
	@Autowired
	private ReportService reportservice;
	
	public String generateReport() {
		
		String generateReport= reportservice.generateReport();
	       return generateReport;
	}
	

}
