package giuseppetavella.D1_menu_pizzeria.entities;

import giuseppetavella.D1_menu_pizzeria.enums.FormatoPizza;
import giuseppetavella.D1_menu_pizzeria.exceptions.PrezzoPizzaTroppoPiccoloException;
import giuseppetavella.D1_menu_pizzeria.interfaces.HaPrezzo;

import java.util.ArrayList;
import java.util.List;

public class Pizza extends ElementoMenu implements HaPrezzo {
    private final List<Ingrediente> basePizza;
    private final List<Topping> toppings = new ArrayList<>();
    private CombinazioneTopping combinazioneTopping;
    private final FormatoPizza formatoPizza;
    private final double prezzo;

    public Pizza(String nome, 
                 double calorie, 
                 double prezzo, 
                 CombinazioneTopping combinazioneTopping, 
                 FormatoPizza formatoPizza) throws PrezzoPizzaTroppoPiccoloException
    {
        if(prezzo <= 2.00) {
              throw new PrezzoPizzaTroppoPiccoloException(prezzo);  
        }
        super(nome, calorie);
        this.prezzo = prezzo;
        // base pizza
        this.basePizza = List.of(
                new Ingrediente("pomodoro", 100),
                new Ingrediente("mozzarella", 150)
        );
        this.combinazioneTopping = combinazioneTopping;
        this.formatoPizza = formatoPizza;
    }

    public Pizza(String nome, double calorie, double prezzo, CombinazioneTopping combinazioneTopping) {
        this(nome, calorie, prezzo, combinazioneTopping, FormatoPizza.NORMALE);
    }
    
    public Pizza(String nome, double calorie, double prezzo) {
        this(nome, calorie, prezzo, null, FormatoPizza.NORMALE);
    }

    public FormatoPizza getFormatoPizza() {
        return formatoPizza;
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
        boolean esisteCombinazioneTopping = getCombinazioneTopping() != null;
        boolean esisteFormatoPizzaParticolare = getFormatoPizza() != FormatoPizza.NORMALE;
        String infoFormatoPizza = esisteFormatoPizzaParticolare ? " ("+getFormatoPizza()+")" : "";
        // esiste la combinazione topping
        if (esisteCombinazioneTopping) {
            return "PIZZA: " + getNome() + " (" + getCombinazioneTopping().getNome() + ")" + infoFormatoPizza + " - €" + getPrezzo();
        }
        // non esiste la combinazione topping
        return "PIZZA: " + getNome() + infoFormatoPizza + " - €" + getPrezzo();         
    }

    @Override
    public double getPrezzo() {
        return prezzo;
    }
}
