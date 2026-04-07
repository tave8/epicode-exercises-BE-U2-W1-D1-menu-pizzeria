package giuseppetavella.D1_menu_pizzeria.entities;

public class Topping extends Ingrediente{
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
        return "Topping{" +
                "prezzo=" + prezzo +
                '}';
    }
}
