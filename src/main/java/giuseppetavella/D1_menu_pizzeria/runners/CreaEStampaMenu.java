package giuseppetavella.D1_menu_pizzeria.runners;

import giuseppetavella.D1_menu_pizzeria.entities.ElementoMenu;
import giuseppetavella.D1_menu_pizzeria.entities.Menu;
import giuseppetavella.D1_menu_pizzeria.entities.Ordine;
import giuseppetavella.D1_menu_pizzeria.entities.Tavolo;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.logging.Logger;

@Component
public class CreaEStampaMenu implements CommandLineRunner {

    // logger 
    private static final Logger LOGGER = Logger.getLogger(CreaEStampaMenu.class.getName());
    
    private Menu menu;
    private double costoCoperto;
    private List<ElementoMenu> elementiMenu;
    
    
    /**
     * I parametri del costruttore sono le dipendenze di questo bean.
     * Perché un componente è un modo di creare un bean.
     * 
     * Il parametro menu che passo al costruttore, qui si verifica
     * la Constructor Injection, che è un modo di implementare la Dependency Injection.
     */
    public CreaEStampaMenu(Menu menu, 
                           @Qualifier("costoCoperto") double costoCoperto, 
                           List<ElementoMenu> elementiMenu) 
    {
        this.menu = menu;
        this.costoCoperto = costoCoperto;
        this.elementiMenu = elementiMenu;
    }

    @Override
    public void run(String... args) throws Exception {

        LOGGER.info("Executing runner '"+this.getClass().getName()+"'on startup");
        
        // System.out.println(menu);
        // System.out.println(costoCoperto);

        Tavolo tavolo1 = new Tavolo(1, 3);
        Tavolo tavolo2 = new Tavolo(2, 3);

        Ordine ordine1 = new Ordine(tavolo1, elementiMenu);
        
        
        menu.stampaMenu();
        ordine1.stampaImportoTotale(costoCoperto);
        
        
        
    }
}
