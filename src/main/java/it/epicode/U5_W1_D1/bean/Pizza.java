package it.epicode.U5_W1_D1.bean;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@NoArgsConstructor
@ToString(callSuper = true)
@Component
public class Pizza extends Prodotto {

    @Autowired
    private List<Topping> toppings;


}
