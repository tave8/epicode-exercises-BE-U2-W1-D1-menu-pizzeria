package giuseppetavella.D1_menu_pizzeria.entities;

import giuseppetavella.D1_menu_pizzeria.enums.StatoOrdine;
import giuseppetavella.D1_menu_pizzeria.interfaces.HaPrezzo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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

    /**
     * Somma dei costi dei suoi elementi + somma dei costi dei coperti
     */
    public double calcolaImportoTotale(Double costoCoperto) {
        double costiElementiMenu = 0;
        double costiCoperti = 0;
        
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

    public void setStatoOrdine(StatoOrdine statoOrdine) {
        this.statoOrdine = statoOrdine;
    }
}
