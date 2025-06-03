package it.epicode.U5_W1_D1.bean;

import lombok.Data;

import java.util.List;

@Data
public class Menu {
    private List<Pizza> pizze;
    private List<Drink> drinks;
    private List<Topping> toppings;

    public void stampaMenu() {
        System.out.println("---- MENU PIZZERIA ----");
        System.out.println("Pizze:");
        pizze.forEach(System.out::println);
        System.out.println("\nBevande:");
        drinks.forEach(System.out::println);
        System.out.println("\nToppings disponibili:");
        toppings.forEach(t -> System.out.println(t.getNome() + " - €" + t.getPrezzo() + " - " + t.getCalorie() + " kcal"));
    }
}