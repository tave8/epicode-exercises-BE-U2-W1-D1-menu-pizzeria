package giuseppetavella.D1_menu_pizzeria.entities;

import giuseppetavella.D1_menu_pizzeria.interfaces.HaPrezzo;

public class Bevanda extends ElementoMenu implements HaPrezzo {
    private final double quantita;
    private final double percentualeAlcool;
    private final double prezzo;
    
    public Bevanda(String nome, double calorie, double prezzo, double quantita, double percentualeAlcool) {
        super(nome, calorie);
        this.quantita = quantita;
        this.prezzo = prezzo;
        this.percentualeAlcool = percentualeAlcool;
    }

    public Bevanda(String nome, double calorie, double prezzo, double quantita) {
        this(nome, calorie, prezzo, quantita, 0);
    }
    

    public double getPercentualeAlcool() {
        return percentualeAlcool;
    }

    public double getQuantita() {
        return quantita;
    }

    @Override
    public String toString() {
        return "BEVANDA: " + getNome() + " - " + getQuantita() + "ml";
    }

    @Override
    public double getPrezzo() {
        return prezzo;
    }
    
}
