package com.BikkadIT.ModesOfAutowiring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.BikkadIT.ModesOfAutowiring.controller.ReportController;

@SpringBootApplication
public class ModesOfAutowiringApplication {

	public static void main(String[] args) {
		//SpringApplication.run(ModesOfAutowiringApplication.class, args);
		
		ConfigurableApplicationContext context = SpringApplication.run(ModesOfAutowiringApplication.class, args);

		ReportController controller = context.getBean(ReportController.class);
		String report = controller.generateReport();
		System.out.println(report);
	}

}
