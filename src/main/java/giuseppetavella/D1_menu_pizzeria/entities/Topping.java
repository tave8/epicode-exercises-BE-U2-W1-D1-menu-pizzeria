package giuseppetavella.D1_menu_pizzeria.entities;

import giuseppetavella.D1_menu_pizzeria.interfaces.HaPrezzo;

public class Topping extends Ingrediente implements HaPrezzo {
    private final double prezzo;
    
    public Topping(String nome, double calorie, double prezzo) {
        super(nome, calorie);
        this.prezzo = prezzo;
    }

    public double getPrezzo() {
        return prezzo;
    }

    @Override
    public String toString() {
        return "TOPPING: " + getNome() + " - €" + getPrezzo();
    }
}
