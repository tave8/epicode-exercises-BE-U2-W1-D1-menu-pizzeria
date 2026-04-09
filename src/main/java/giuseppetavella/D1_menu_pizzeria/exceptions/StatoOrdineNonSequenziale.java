package giuseppetavella.D1_menu_pizzeria.exceptions;

import giuseppetavella.D1_menu_pizzeria.enums.StatoOrdine;

public class StatoOrdineNonSequenziale extends RuntimeException {
    public StatoOrdineNonSequenziale(StatoOrdine statoOrdineAttuale, StatoOrdine statoOrdineDesiderato) {
        super("L'assegnazione di uno nuovo stato ordine non è sequenziale: " 
                + statoOrdineDesiderato + " (desiderato) non può venire dopo " 
                + statoOrdineAttuale + " (attuale)");
    }
}
