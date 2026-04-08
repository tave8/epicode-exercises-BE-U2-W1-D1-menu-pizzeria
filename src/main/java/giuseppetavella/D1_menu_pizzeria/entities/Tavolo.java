package giuseppetavella.D1_menu_pizzeria.entities;

import giuseppetavella.D1_menu_pizzeria.enums.StatoTavolo;

public class Tavolo {
    
    private final long numeroTavolo;
    private long numeroCopertiMassimo;
    private StatoTavolo statoTavolo;
    
    public Tavolo(long numeroTavolo, long numeroCopertiMassimo, StatoTavolo statoTavolo) {
        this.numeroTavolo = numeroTavolo;
        this.setNumeroCopertiMassimo(numeroCopertiMassimo);
        this.setStatoTavolo(statoTavolo);
    }

    public Tavolo(long numeroTavolo, long numeroCopertiMassimo) {
        this(numeroTavolo, numeroCopertiMassimo, StatoTavolo.OCCUPATO);
    }

    public long getNumeroCopertiMassimo() {
        return numeroCopertiMassimo;
    }

    public void setNumeroCopertiMassimo(long numeroCopertiMassimo) {
        this.numeroCopertiMassimo = numeroCopertiMassimo;
    }

    public long getNumeroTavolo() {
        return numeroTavolo;
    }

    public StatoTavolo getStatoTavolo() {
        return statoTavolo;
    }

    public void setStatoTavolo(StatoTavolo statoTavolo) {
        this.statoTavolo = statoTavolo;
    }
}
