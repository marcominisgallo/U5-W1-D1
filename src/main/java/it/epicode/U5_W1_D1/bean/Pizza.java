package it.epicode.U5_W1_D1.bean;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@ToString(callSuper = true)
/*@Component va messo qua e Autowired prima del private List per creare automaticamente la lista coi Topping esistenti*/
public class Pizza extends Prodotto {


    private List<Topping> toppings = new ArrayList<>();

    public void addTopping(Topping topping) {
        toppings.add(topping);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(getNome());
        if (!toppings.isEmpty()) {
            sb.append(" (");
            toppings.forEach(t -> sb.append(t.getNome()).append(", "));
            sb.setLength(sb.length() - 2);
            sb.append(")");
        }
        sb.append(" - €").append(getPrezzo()).append(" - ").append(getCalorie()).append(" kcal");
        return sb.toString();
    }


}
