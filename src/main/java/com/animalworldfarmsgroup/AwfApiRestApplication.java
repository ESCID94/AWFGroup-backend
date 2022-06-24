package com.animalworldfarmsgroup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages= {"com.animalworldfarmsgroup"})
@EnableJpaRepositories("com.animalworldfarmsgroup")
@EntityScan("com.animalworldfarmsgroup")
@EnableAutoConfiguration
@ComponentScan
@Configuration
public class AwfApiRestApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(AwfApiRestApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(AwfApiRestApplication.class, args);
	}

}
