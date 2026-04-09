package giuseppetavella.D1_menu_pizzeria.exceptions;

public class PrezzoPizzaTroppoPiccoloException extends RuntimeException {
    public PrezzoPizzaTroppoPiccoloException(double prezzo) {
        super("Il prezzo " + prezzo + " è troppo poco per una pizza.");
    }
}
