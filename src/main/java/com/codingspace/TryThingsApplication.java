package com.codingspace;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling
@Configuration
public class TryThingsApplication {

	public static void main(String[] args) {
		SpringApplication.run(TryThingsApplication.class, args);
	}
	
	@Scheduled(cron="0 0 0 * * *") //https://crontab.guru/
	void someMethod()
	{
		System.out.println("Now is "+new Date());
	}

}
