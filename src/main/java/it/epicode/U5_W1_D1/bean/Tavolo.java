package it.epicode.U5_W1_D1.bean;

import it.epicode.U5_W1_D1.enumerations.StatoTavolo;
import lombok.Data;

@Data
public class Tavolo {
    private int numero;
    private int maxCoperti;
    private StatoTavolo stato;
}