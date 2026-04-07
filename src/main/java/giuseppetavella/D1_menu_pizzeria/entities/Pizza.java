package giuseppetavella.D1_menu_pizzeria.entities;

import java.util.ArrayList;
import java.util.List;

public class Pizza extends ElementoMenu {
    private final List<Ingrediente> basePizza;
    private final List<Topping> toppings = new ArrayList<>();
    private CombinazioneTopping combinazioneTopping;
    
    public Pizza(String nome, double calorie) {
        super(nome, calorie);
        // base pizza
        this.basePizza = List.of(
                new Ingrediente("pomodoro", 100),
                new Ingrediente("mozzarella", 150)
        );
        
    }

    public List<Ingrediente> getBasePizza() {
        return basePizza;
    }

    public CombinazioneTopping getCombinazioneTopping() {
        return combinazioneTopping;
    }

    public void setCombinazioneTopping(CombinazioneTopping combinazioneTopping) {
        this.combinazioneTopping = combinazioneTopping;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "basePizza=" + basePizza +
                ", toppings=" + toppings +
                ", combinazioneTopping=" + combinazioneTopping +
                '}';
    }
}
