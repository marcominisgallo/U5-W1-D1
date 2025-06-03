package it.epicode.U5_W1_D1.bean;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString(callSuper = true)
public class Topping extends Prodotto {

    private boolean glutenFree;
}
