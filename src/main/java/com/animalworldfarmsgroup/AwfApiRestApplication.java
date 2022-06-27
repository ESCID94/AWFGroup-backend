package com.animalworldfarmsgroup;

import com.animalworldfarmsgroup.model.Animal;
import com.animalworldfarmsgroup.repository.AnimalRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.time.LocalDate;
import java.util.stream.Stream;

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

/*	@Bean
	CommandLineRunner init(AnimalRepository repository) {
		return args -> {
			Stream.of(1000.5, 150.5, 260.70, 340.0, 800.60, 540.0).forEach(weight -> {
				Animal animal = new Animal("PORK", "DUROC", "M", weight, 1, 11L, 1L, LocalDate.now(), LocalDate.now(), LocalDate.now(), LocalDate.now());
				repository.save(animal);
			});
			repository.findAll().forEach(System.out::println);
		};
	}*/

}
