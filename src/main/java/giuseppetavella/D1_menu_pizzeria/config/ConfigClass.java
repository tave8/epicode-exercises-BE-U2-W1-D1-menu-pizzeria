package giuseppetavella.D1_menu_pizzeria.config;

import giuseppetavella.D1_menu_pizzeria.entities.*;
import giuseppetavella.D1_menu_pizzeria.enums.FormatoPizza;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;

@Configuration
@PropertySource("application.properties")
public class ConfigClass {

    /**
     * NOME DEL MENU
     */
    @Bean(name = "ottieniNomeMenu")
    public String ottieniNomeMenu() {
        return "Menu Standard";
    }

    /**
     * ELEMENTI DEL MENU
     */
    @Bean(name = "ottieniElementiMenu")
    public List<ElementoMenu> ottieniElementiMenu() {
        // posso creare bean in metodo, fintanto che sia un bean
        // a sua volta
        // sia input che output deve essere bean
        // sia input che output deve 
        return List.of(
                new Pizza("Pizza Margherita", 200, 20),
                new Bevanda("sex on the beach", 100, 10, 200),
                new Topping("funghi", 50, 5),
                new Pizza("Pizza Imperiale", 100, 20),
                new Bevanda("mojito", 40, 10, 5)
        );
    }

    /**
     * COSTO DEL COPERTO
     */
    @Bean(name = "ottieniCostoCoperto")
    public double ottieniCostoCoperto(@Value("${tavolo.coperto.costo}") String costoCoperto) {
        return Double.parseDouble(costoCoperto);
    }
    
    


    // @Bean(name = "pizzaMargherita")
    // public Pizza ottieniPizzaMargherita() {
    //     Pizza pizza = new Pizza(
    //             "Pizza Margherita",
    //             300,
    //             5.90
    //     );
    //     return pizza;
    // }
    //
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
