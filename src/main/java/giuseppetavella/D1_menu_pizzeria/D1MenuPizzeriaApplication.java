package giuseppetavella.D1_menu_pizzeria;

import giuseppetavella.D1_menu_pizzeria.entities.Menu;
import giuseppetavella.D1_menu_pizzeria.entities.Pizza;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class D1MenuPizzeriaApplication {

	public static void main(String[] args) {
		SpringApplication.run(D1MenuPizzeriaApplication.class, args);


		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(D1MenuPizzeriaApplication.class);
		
		// Pizza pizzaMargherita = ctx.getBean(Pizza.class);

		Menu menuEstate = ctx.getBean("menuEstate", Menu.class);
		
		// menuEstate.stampaMenu();

		System.out.println(menuEstate);
		
		// System.out.println(pizzaMargherita);
		
	}

}
