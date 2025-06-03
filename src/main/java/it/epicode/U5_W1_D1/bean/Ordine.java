package it.epicode.U5_W1_D1.bean;

import it.epicode.U5_W1_D1.enumerations.StatoOrdine;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class Ordine {
    private int numeroOrdine;
    private StatoOrdine stato;
    private int numeroCoperti;
    private LocalDateTime oraAcquisizione;
    private Tavolo tavolo;
    private List<Prodotto> elementiMenu;
    private double costoCoperto;

    public double getTotale() {
        double totale = costoCoperto * numeroCoperti;
        for (Prodotto p : elementiMenu) {
            totale += p.getPrezzo();
        }
        return totale;
    }
}
