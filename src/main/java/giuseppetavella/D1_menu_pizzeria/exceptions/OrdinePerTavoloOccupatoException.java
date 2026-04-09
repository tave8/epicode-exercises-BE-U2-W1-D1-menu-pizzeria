package giuseppetavella.D1_menu_pizzeria.exceptions;

import giuseppetavella.D1_menu_pizzeria.entities.Tavolo;

public class OrdinePerTavoloOccupatoException extends RuntimeException {
    public OrdinePerTavoloOccupatoException(Tavolo tavolo) {
        super("Non si può fare l'ordine nel tavolo perché è occupato. Tavolo: " + tavolo);
    }
}
