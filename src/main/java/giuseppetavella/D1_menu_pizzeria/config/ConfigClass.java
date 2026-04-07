package giuseppetavella.D1_menu_pizzeria.config;

import giuseppetavella.D1_menu_pizzeria.entities.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class ConfigClass {
    
    @Bean(name = "menuEstate")
    public Menu ottieniMenuEstate(List<ElementoMenu> elementiMenu) {
        Menu menu = new Menu("Menu Estate", elementiMenu);
        return menu;
    }
    
    @Bean
    public List<ElementoMenu> ottieniElementiMenu(Pizza pizzaMargherita, Bevanda sexOnTheBeach, Topping funghi) {
        return List.of(
                pizzaMargherita,
                sexOnTheBeach,
                funghi
        );
    }
    
    @Bean
    public Pizza ottieniPizzaMargherita() {
        Pizza pizzaMargherita = new Pizza(
                "Pizza Margherita",
                300
        );
        return pizzaMargherita;
    }
    
    @Bean
    public Bevanda ottieniCocktailSexOnTheBeach() {
        Bevanda cocktailSexOnTheBeach = new Bevanda(
                "Cocktail Sex On The Beach",
                300,
                400,
                20
        );
        return cocktailSexOnTheBeach;
    }
    
    @Bean
    public Topping ottieniFunghi() {
        Topping funghi = new Topping("funghi", 50, 2);
        return funghi;
    }
    
    
}
