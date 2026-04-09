package giuseppetavella.D1_menu_pizzeria;

import giuseppetavella.D1_menu_pizzeria.entities.Menu;
import giuseppetavella.D1_menu_pizzeria.entities.Ordine;
import giuseppetavella.D1_menu_pizzeria.entities.Pizza;
import giuseppetavella.D1_menu_pizzeria.entities.Tavolo;
import giuseppetavella.D1_menu_pizzeria.enums.StatoOrdine;
import giuseppetavella.D1_menu_pizzeria.exceptions.PrezzoPizzaTroppoPiccoloException;
import giuseppetavella.D1_menu_pizzeria.exceptions.StatoOrdineNonSequenzialeException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class D1MenuPizzeriaApplicationTests {
	
	@Autowired
	private Menu menu;
	
	@Autowired
	@Qualifier("ottieniCostoCoperto")
	private double costoCoperto;
	
	
	@Test
	public void menuHaNomeCorretto() {
		assertEquals("menu standard", menu.getNome().toLowerCase());
	}
	
	@Test
	public void menuHaAlmenoUnElemento() {
		assertTrue(menu.getElementiMenu().size() > 0);
	}
	
	@Test
	public void costoCopertoEMaggioreDiZero() {
		assertTrue(costoCoperto > 0);
	}
	
	@Test
	public void nuovoStatoOrdineFallisceSeNonSequenziale() {
		Tavolo tavolo1 = new Tavolo(1, 3);
		Ordine ordine1 = new Ordine(tavolo1, menu.getElementiMenu());

		// lo stato dell'ordine appena creato è in corso, quindi 
		// lo stato dell'ordine non può passare a servito o pagato,
		// senza prima essere pronto
		assertThrows(
				StatoOrdineNonSequenzialeException.class,
				() -> ordine1.setStatoOrdine(StatoOrdine.SERVITO)
		);
		assertThrows(
				StatoOrdineNonSequenzialeException.class,
				() -> ordine1.setStatoOrdine(StatoOrdine.PAGATO)
		);
	}

	@Test
	public void nuovoStatoOrdineESequenziale() {
		Tavolo tavolo1 = new Tavolo(1, 3);
		Ordine ordine1 = new Ordine(tavolo1, menu.getElementiMenu());
		// lo stato dell'ordine appena creato è in corso, 
		// quindi il prossimo stato che posso assegnare è pronto
		assertDoesNotThrow(
				() -> ordine1.setStatoOrdine(StatoOrdine.PRONTO)
		);
	}
	
	@ParameterizedTest
	@CsvSource({
		"2", "1.99"	
	})
	public void prezzoPizzaFallisceSeTroppoPiccolo(double prezzoPizza) {
		assertThrows(
				PrezzoPizzaTroppoPiccoloException.class, 
				() -> {
					new Pizza(
							"pizza test",
							100,
							prezzoPizza
					);
				}
		);
	} 

}
