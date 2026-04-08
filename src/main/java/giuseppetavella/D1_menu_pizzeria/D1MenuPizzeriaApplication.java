package giuseppetavella.D1_menu_pizzeria;

import giuseppetavella.D1_menu_pizzeria.entities.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

@SpringBootApplication
public class D1MenuPizzeriaApplication {

	public static void main(String[] args) {
		SpringApplication.run(D1MenuPizzeriaApplication.class, args);


		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(D1MenuPizzeriaApplication.class);
		
		
	}

}
