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
     * COSTO DEL COPERTO
     */
    @Bean(name = "ottieniCostoCoperto")
    public double ottieniCostoCoperto(@Value("${tavolo.coperto.costo}") String costoCoperto) {
        return Double.parseDouble(costoCoperto);
    }


    /**
     * PIZZA MARGHERITA
     */
    @Bean(name = "ottieniPizzaMargherita")
    public Pizza ottieniPizzaMargherita() {
        Pizza pizza = new Pizza(
                "Pizza Margherita",
                300,
                5.90
        );
        return pizza;
    }

    /**
     * MOJITO
     */
    @Bean(name = "ottieniMojito")
    public Bevanda ottieniMojito() {
        Bevanda bevanda = new Bevanda(
                            "mojito",
                            300,
                            400,
                            20
        );
        return bevanda;
    }


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
