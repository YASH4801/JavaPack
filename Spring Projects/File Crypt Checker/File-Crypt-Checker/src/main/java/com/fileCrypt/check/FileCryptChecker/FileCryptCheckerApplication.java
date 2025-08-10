package com.fileCrypt.check.FileCryptChecker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FileCryptCheckerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FileCryptCheckerApplication.class, args);
		try {
			FileProcessor.runApplication();
		} catch (Exception e) {
			System.err.println("Error occurred while running the application: " + e.getMessage());
            e.printStackTrace();
		}

	}

}
