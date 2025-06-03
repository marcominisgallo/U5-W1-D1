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
    public void run(String... args) throws Exception {

        //serve per accedere al contesto di Spring e ai suoi bean
        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext(U5W1D1Application.class);

        Drink water = ctx.getBean(Drink.class);
        System.out.println("drink " + water);

        Topping t1 = ctx.getBean("mozzarella", Topping.class);
        System.out.println("t1 " + t1);

        Topping t2 = ctx.getBean("tomato", Topping.class);
        System.out.println("t2 " + t2);

        Pizza p = ctx.getBean(Pizza.class);
        System.out.println("pizza " + p);

        menu.stampaMenu();
    }
}
