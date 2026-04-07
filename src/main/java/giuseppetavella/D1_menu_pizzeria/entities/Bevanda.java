package giuseppetavella.D1_menu_pizzeria.entities;

public class Bevanda extends ElementoMenu{
    private final double quantita;
    private final double percentualeAlcool;
    
    public Bevanda(String nome, double calorie, double quantita, double percentualeAlcool) {
        super(nome, calorie);
        this.quantita = quantita;
        this.percentualeAlcool = percentualeAlcool;
    }

    public Bevanda(String nome, double calorie, double quantita) {
        this(nome, calorie, quantita, 0);
    }

    public double getPercentualeAlcool() {
        return percentualeAlcool;
    }

    public double getQuantita() {
        return quantita;
    }

    @Override
    public String toString() {
        return "Bevanda{" +
                "percentualeAlcool=" + percentualeAlcool +
                ", quantita=" + quantita +
                '}';
    }
}
