package it.epicode.U5_W1_D1;

import it.epicode.U5_W1_D1.bean.Drink;
import it.epicode.U5_W1_D1.bean.Menu;
import it.epicode.U5_W1_D1.bean.Pizza;
import it.epicode.U5_W1_D1.bean.Topping;
import it.epicode.U5_W1_D1.configuration.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Component //serve a spring di gestire a completamente questa classe.
@Order(1) //serve a dare un ordine di esecuzione a questa classe.
public class Runner implements CommandLineRunner {

    @Autowired
    private Menu menu;

    @Override
    public void run(String... args) {
        // Usa direttamente i bean dal menu
        Drink water = menu.getDrinks().get(0);
        System.out.println("drink " + water);

        Topping t1 = menu.getToppings().stream().filter(t -> t.getNome().equals("Mozzarella")).findFirst().orElse(null);
        System.out.println("t1 " + t1);

        Topping t2 = menu.getToppings().stream().filter(t -> t.getNome().equals("Pomodoro")).findFirst().orElse(null);
        System.out.println("t2 " + t2);

        Pizza p = menu.getPizze().get(0);
        System.out.println("pizza " + p);

        menu.stampaMenu();
    }
}
