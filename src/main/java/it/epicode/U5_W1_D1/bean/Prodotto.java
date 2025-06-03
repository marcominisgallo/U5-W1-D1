package it.epicode.U5_W1_D1.bean;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public abstract class Prodotto {

    private String nome;
    private double prezzo;
    private int calorie;
}
