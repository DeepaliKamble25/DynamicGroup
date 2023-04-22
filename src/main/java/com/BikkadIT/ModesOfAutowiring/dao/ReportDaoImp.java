package com.BikkadIT.ModesOfAutowiring.dao;

import org.springframework.stereotype.Repository;

@Repository
public class ReportDaoImp implements ReportDao1{

	@Override
	public String generateReport() {
		String msg="Getting Data from database";
		return msg;
	}

}
