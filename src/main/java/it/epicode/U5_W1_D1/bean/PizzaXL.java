package it.epicode.U5_W1_D1.bean;

public class PizzaXL extends Pizza {
    public PizzaXL(Pizza base) {
        setNome(base.getNome() + " XL");
        setPrezzo(base.getPrezzo() * 1.5);
        setCalorie((int)(base.getCalorie() * 1.5));
        getToppings().addAll(base.getToppings());
    }
}