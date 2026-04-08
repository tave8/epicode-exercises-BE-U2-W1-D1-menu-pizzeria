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
		
		Double costoCoperto = ctx.getBean("costoCoperto", Double.class);
		
		Pizza pizzaMargherita = ctx.getBean(Pizza.class);
		
		List<ElementoMenu> elementiMenu = List.of(
				pizzaMargherita
		);

		Tavolo tavolo1 = new Tavolo(1, 3);
		Tavolo tavolo2 = new Tavolo(2, 3);
		
		// Ordine ordine1 = new Ordine(tavolo1, pizzaMargherita);
		
		
		
		// Pizza pizzaMargherita = ctx.getBean(Pizza.class);

		// Menu menuEstate = ctx.getBean("menuEstate", Menu.class);
		//
		// menuEstate.stampaMenu();

		
		// System.out.println(pizzaMargherita);
		
	}

}
