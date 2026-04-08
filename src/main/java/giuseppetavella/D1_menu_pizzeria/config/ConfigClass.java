package giuseppetavella.D1_menu_pizzeria.config;

import giuseppetavella.D1_menu_pizzeria.entities.*;
import giuseppetavella.D1_menu_pizzeria.enums.FormatoPizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class ConfigClass {
    
    // @Bean(name = "menuEstate")
    // public Menu ottieniMenuEstate(List<ElementoMenu> elementiMenu) {
    //     Menu menu = new Menu("Menu Estate", elementiMenu);
    //     return menu;
    // }
    //
    // @Bean
    // public List<ElementoMenu> ottieniElementiMenu(Pizza pizza, Bevanda sexOnTheBeach, Topping funghi) {
    //     // posso creare bean in metodo, fintanto che sia un bean
    //     // a sua volta
    //     // sia input che output deve essere bean
    //     // sia input che output deve 
    //     return List.of(
    //             pizza,
    //             sexOnTheBeach,
    //             funghi
    //     );
    // }
    //
    // @Bean
    // public Pizza ottieniPizzaQuattroStagioni(CombinazioneTopping combinazioneTopping) {
    //     Pizza pizza = new Pizza(
    //             "Pizza Margherita",
    //             300,
    //             combinazioneTopping,
    //             FormatoPizza.XL
    //     );
    //     return pizza;
    // }
    //
    // @Bean
    // public Bevanda ottieniCocktailSexOnTheBeach() {
    //     Bevanda cocktailSexOnTheBeach = new Bevanda(
    //             "Cocktail Sex On The Beach",
    //             300,
    //             400,
    //             20
    //     );
    //     return cocktailSexOnTheBeach;
    // }
    //
    // @Bean
    // public Topping ottieniFunghi() {
    //     Topping funghi = new Topping("funghi", 50, 2);
    //     return funghi;
    // }
    //
    // @Bean
    // public CombinazioneTopping ottieniCombinazioneToppingQuattroStagioni() {
    //     List<Topping> toppings = List.of(
    //             new Topping("gorgonzola", 200, 2),
    //             new Topping("emmental", 200, 2),
    //             new Topping("grana", 200, 2),
    //             new Topping("parmigiano", 200, 2)
    //     );
    //     return new CombinazioneTopping("Quattro Stagioni", toppings);
    // }
    
    
}
