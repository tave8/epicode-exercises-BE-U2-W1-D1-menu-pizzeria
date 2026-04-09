package giuseppetavella.D1_menu_pizzeria.entities;

import giuseppetavella.D1_menu_pizzeria.enums.StatoOrdine;
import giuseppetavella.D1_menu_pizzeria.exceptions.StatoOrdineNonSequenzialeException;
import giuseppetavella.D1_menu_pizzeria.interfaces.HaPrezzo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ordine {
    
    private static long numeroOrdineSequenziale = 0;
    
    private final long numeroOrdine;
    private Tavolo tavolo;
    private final List<ElementoMenu> elementiMenu = new ArrayList<>();
    private StatoOrdine statoOrdine;
    private long numeroCoperti;
    private final LocalDateTime dataEOraAggiunto;
    
    public Ordine(Tavolo tavolo, List<ElementoMenu> elementiMenu, long numeroCoperti) {
        this.setTavolo(tavolo);
        this.aggiungiElementiMenuAOrdine(elementiMenu);
        this.setStatoOrdine(StatoOrdine.IN_CORSO);
        this.setNumeroCoperti(numeroCoperti);
        this.dataEOraAggiunto = LocalDateTime.now();
        Ordine.numeroOrdineSequenziale += 1;
        this.numeroOrdine = Ordine.numeroOrdineSequenziale;
    }
    
    public Ordine(Tavolo tavolo, List<ElementoMenu> elementiMenu) {
        this(tavolo, elementiMenu, 3);
    }
    
    public void stampaImportoTotale(double costoCoperto) {
        System.out.println();
        System.out.println("******** IMPORTO TOTALE ORDINE: €"+calcolaImportoTotale(costoCoperto)+" **************");
        System.out.println();
    }

    /**
     * Somma dei costi dei suoi elementi + somma dei costi dei coperti
     */
    public double calcolaImportoTotale(double costoCoperto) {
        double costiElementiMenu = 0;
        double costiCoperti = numeroCoperti * costoCoperto;
        
        for(ElementoMenu elementoMenu : getElementiMenu()) {
            if (elementoMenu instanceof HaPrezzo) {
                HaPrezzo elementoMenuConPrezzo = (HaPrezzo) elementoMenu;
                costiElementiMenu += elementoMenuConPrezzo.getPrezzo();        
            }
        }
        
        // TODO: completa costo coperti

        return costiElementiMenu + costiCoperti;        
    }

    public void aggiungiElementiMenuAOrdine(List<ElementoMenu> elementiMenu) {
        for (ElementoMenu elementoMenu : elementiMenu) {
            aggiungiElementoMenuAOrdine(elementoMenu);
        }
    }
    
    public void aggiungiElementoMenuAOrdine(ElementoMenu elementoMenu) {
        this.elementiMenu.add(elementoMenu);
    }
    
    public LocalDateTime getDataEOraAggiunto() {
        return dataEOraAggiunto;
    }

    public Tavolo getTavolo() {
        return tavolo;
    }

    public void setTavolo(Tavolo tavolo) {
        this.tavolo = tavolo;
    }

    public List<ElementoMenu> getElementiMenu() {
        return elementiMenu;
    }

    public long getNumeroCoperti() {
        return numeroCoperti;
    }

    public void setNumeroCoperti(long numeroCoperti) {
        this.numeroCoperti = numeroCoperti;
    }

    public long getNumeroOrdine() {
        return numeroOrdine;
    }
    

    public StatoOrdine getStatoOrdine() {
        return statoOrdine;
    }

    public void setStatoOrdine(StatoOrdine nuovoStatoOrdine) throws StatoOrdineNonSequenzialeException {
        // imposta la logica sequenziale dello stato ordine:
        // IN CORSO -> PRONTO -> SERVITO -> PAGATO 

        Map<StatoOrdine, StatoOrdine> sequenzaPerStatoOrdine = new HashMap<>(Map.of(
                StatoOrdine.IN_CORSO, StatoOrdine.PRONTO,
                StatoOrdine.PRONTO, StatoOrdine.SERVITO,
                StatoOrdine.SERVITO, StatoOrdine.PAGATO
        ));
        
        // il primo stato ordine non ha attuale
        if(nuovoStatoOrdine == StatoOrdine.IN_CORSO) {
            this.statoOrdine = nuovoStatoOrdine;
            return;
        }
        
        boolean statiOrdineSonoSequenziali = true;
        
        // se il nuovo stato ordine non è una chiave (ad esempio il pagato)
        // perché non c'è uno prossimo stato ordine dopo pagato
        if(sequenzaPerStatoOrdine.get(nuovoStatoOrdine) == null) {
            statiOrdineSonoSequenziali = false; 
        } 
        // se lo stato di ordine attuale non ha come prossimo stato ordine
        // il nuovo stato ordine desiderato
        else if (sequenzaPerStatoOrdine.get(getStatoOrdine()) != nuovoStatoOrdine) {
            statiOrdineSonoSequenziali = false;
        }
        
        if(!statiOrdineSonoSequenziali) {
            throw new StatoOrdineNonSequenzialeException(getStatoOrdine(), nuovoStatoOrdine);
        }
        
        this.statoOrdine = nuovoStatoOrdine;
    }
}
