package com.example.springboot;

import java.util.*;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		// this runs the main application
		SpringApplication.run(Application.class, args);

		// Add a user to the userstore for testing
		ArrayList<String> newUser = new ArrayList<String>();
		newUser.add("JohnDoe@email.com");
		newUser.add("password");
		TvlRepository.userstore.add(newUser);

		// Add a fine to the finestore for testing
		ArrayList<String> newFine1 = new ArrayList<String>();
		newFine1.add("1"); // Id
		newFine1.add("JohnDoe@email.com"); // User
		newFine1.add("152 Winchester Street,  BT1 4JQ"); // Location
		newFine1.add("09/05/2022"); // Contravention date
		newFine1.add("12:39pm"); // Contravention time
		newFine1.add("£60"); // Contravention code
		newFine1.add("OF245"); // Issued by the Civil Enforcement Officer
		newFine1.add("Watching BBC iPlayer without Licence"); // Parking contravention
		newFine1.add("UNPAID"); // Status

		ArrayList<String> newFine2 = new ArrayList<String>();
		newFine2.add("2"); // Id
		newFine2.add("anotheruser@email.com"); // User
		newFine2.add("Chichester Street,  BT1 4JQ"); // Location
		newFine2.add("09/05/2022"); // Contravention date
		newFine2.add("12:39 To 12:47"); // Contravention time
		newFine2.add("01"); // Contravention code
		newFine2.add("FG245"); // Issued by the Civil Enforcement Officer
		newFine2.add("Parked in a restricted street during prescribed hours"); // Parking contravention
		newFine2.add("UNPAID"); // Status

		ArrayList<String> newFine3 = new ArrayList<String>();
		newFine3.add("3"); // Id
		newFine3.add("anotheruser@email.com"); // User
		newFine3.add("Chichester Street,  BT1 4JQ"); // Location
		newFine3.add("12/05/2022"); // Contravention date
		newFine3.add("16:30 To 17:31"); // Contravention time
		newFine3.add("01"); // Contravention code
		newFine3.add("FG245"); // Issued by the Civil Enforcement Officer
		newFine3.add("Parked in a restricted street during prescribed hours"); // Parking contravention
		newFine3.add("UNPAID"); // Status

		TvlRepository.finestore.add(newFine1);
		TvlRepository.finestore.add(newFine2);
		TvlRepository.finestore.add(newFine3);

	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {

			System.out.println("Let's inspect the beans provided by Spring Boot:");

			String[] beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for (String beanName : beanNames) {
				System.out.println(beanName);
			}

		};
	}

}
