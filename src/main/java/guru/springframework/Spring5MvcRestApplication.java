package guru.springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"guru.springframework.controllers", "guru.springframework.services", "guru.springframework.api.v1.mapper", 
	"guru.springframework.api.v1.model", "guru.springframework.bootstrap"})
@EntityScan("guru.springframework.domain")
@EnableJpaRepositories("guru.springframework.repositories")

public class Spring5MvcRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spring5MvcRestApplication.class, args);
	}

}
