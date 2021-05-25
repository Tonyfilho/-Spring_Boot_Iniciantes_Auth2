package spring.com.spring_iniciantes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SPRINGBOOTAPPLICATION tranz um serie de anotações dentro para dizer para JAVA que estamos usando SPRING-BOOT
//@ENABLEAUTOCONFIGURATION é a anotação que faz a mágica do spring, ele GERA varios BEANS para ser injetado no SPRING
@SpringBootApplication
public class SpringIniciantesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringIniciantesApplication.class, args);
	}

}
