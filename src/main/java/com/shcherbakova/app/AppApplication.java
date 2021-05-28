package com.shcherbakova.app;

import com.shcherbakova.app.persistance.model.Book;
import com.shcherbakova.app.persistance.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RequestMapping;

@EnableJpaRepositories("com.shcherbakova.app.persistance.repository")
@EntityScan("com.shcherbakova.app.persistance.model")
@SpringBootApplication
public class AppApplication {
	@RequestMapping("/")
	String home() {
		return "Hello World!";
	}

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}

	/*@Bean
	public CommandLineRunner demo(BookRepository bookRepository) {
		return (args) -> {
			bookRepository.save(new Book("Pam", "B"));
			bookRepository.save(new Book("Jim", "H"));
			bookRepository.save(new Book("Dwight", "S"));
		};

}*/}
