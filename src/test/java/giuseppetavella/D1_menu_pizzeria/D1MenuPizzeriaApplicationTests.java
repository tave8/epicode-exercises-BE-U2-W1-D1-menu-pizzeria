package giuseppetavella.D1_menu_pizzeria;

import giuseppetavella.D1_menu_pizzeria.entities.Menu;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
class D1MenuPizzeriaApplicationTests {
	
	@Autowired
	private Menu menu;
	
	
	@Test
	public void menuHaNomeCorretto() {
		assertEquals("menu standard", menu.getNome().toLowerCase());
	}
	
	@Test
	public void menuHaAlmeno1Elemento() {
		assertNotEquals(0, menu.getElementiMenu().size());
	}
	
	

}
