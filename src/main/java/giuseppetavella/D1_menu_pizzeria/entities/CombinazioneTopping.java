package giuseppetavella.D1_menu_pizzeria.entities;

import java.util.ArrayList;
import java.util.List;

public class CombinazioneTopping {
    private final String nome;
    private final List<Topping> toppings;
    
    public CombinazioneTopping(String nome, List<Topping> toppings) {
        this.nome = nome;
        this.toppings = toppings;
    }

    public String getNome() {
        return nome;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    @Override
    public String toString() {
        return "CombinazioneTopping{" +
                "nome='" + nome + '\'' +
                ", toppings=" + toppings +
                '}';
    }
}
