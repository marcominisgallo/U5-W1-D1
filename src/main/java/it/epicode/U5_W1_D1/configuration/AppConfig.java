package it.epicode.U5_W1_D1.configuration;

import it.epicode.U5_W1_D1.bean.*;
import it.epicode.U5_W1_D1.enumerations.TipoDrink;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.Arrays;

@Configuration
public class AppConfig {

    @Bean //serve a far capire a Spring che questo metodo deve essere
    //chiamato automaticamente da Spring per creare un bean
    @Primary
    public Drink getWater() {
        Drink water = new Drink();
        water.setTipoDrink(TipoDrink.ANALCOLICO);
        water.setCalorie(0);
        water.setNome("Acqua naturale");
        water.setPrezzo(1);
        return water;
    }

    @Bean(name="tomato")
    @Primary //serve a dare precedenza a questo bean se ne esistono più dello stesso tipo
    public Topping getTomato() {
        Topping tomato = new Topping();
        tomato.setNome("Pomodoro");
        tomato.setPrezzo(1);
        tomato.setCalorie(100);
        tomato.setGlutenFree(true);
        return tomato;
    }

    @Bean(name="mozzarella")
    public Topping getMozzarella() {
        Topping mozzarella = new Topping();
        mozzarella.setNome("Mozzarella");
        mozzarella.setPrezzo(1);
        mozzarella.setCalorie(200);
        mozzarella.setGlutenFree(true);
        return mozzarella;
    }

    @Bean
    public Topping prosciutto() {
        Topping prosciutto = new Topping();
        prosciutto.setNome("Prosciutto");
        prosciutto.setPrezzo(1.5);
        prosciutto.setCalorie(150);
        prosciutto.setGlutenFree(false);
        return prosciutto;
    }

    @Bean
    public Topping ananas() {
        Topping ananas = new Topping();
        ananas.setNome("Ananas");
        ananas.setPrezzo(1.2);
        ananas.setCalorie(80);
        ananas.setGlutenFree(true);
        return ananas;
    }

    @Bean
    @Primary
    public Pizza margherita() {
        Pizza p = new Pizza();
        p.setNome("Margherita");
        p.setPrezzo(5);
        p.setCalorie(700);
        p.addTopping(getMozzarella());
        p.addTopping(getTomato());
        return p;
    }

    @Bean
    public Pizza hawaiian() {
        Pizza p = new Pizza();
        p.setNome("Hawaiian Pizza");
        p.setPrezzo(7);
        p.setCalorie(900);
        p.addTopping(getMozzarella());
        p.addTopping(getTomato());
        p.addTopping(prosciutto());
        p.addTopping(ananas());
        return p;
    }

    @Bean
    public PizzaXL margheritaXL() {
        return new PizzaXL(margherita());
    }

    @Bean
    public Drink cola() {
        Drink cola = new Drink();
        cola.setNome("Cola");
        cola.setPrezzo(2);
        cola.setCalorie(150);
        cola.setTipoDrink(TipoDrink.ANALCOLICO);
        return cola;
    }

    @Bean
    public Menu menu() {
        Menu m = new Menu();
        m.setPizze(Arrays.asList(margherita(), hawaiian(), margheritaXL()));
        m.setDrinks(Arrays.asList(getWater(), cola()));
        m.setToppings(Arrays.asList(getMozzarella(), getTomato(), prosciutto(), ananas()));
        return m;
    }
}
