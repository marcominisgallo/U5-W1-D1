package it.epicode.U5_W1_D1.bean;

import it.epicode.U5_W1_D1.enumerations.TipoDrink;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString(callSuper = true) //dice a sping di usare anche il tostring della super classe
public class Drink extends Prodotto {

    private TipoDrink tipoDrink;
}
