package com.BikkadIT.ModesOfAutowiring.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIT.ModesOfAutowiring.dao.ReportDaoImp;

@Service
public class ReportService {
	@Autowired
	private ReportDaoImp reportdaoImp; 
	
	public String generateReport() {
          
		String generateReport= reportdaoImp.generateReport();
	       return generateReport;
	
	}
}
