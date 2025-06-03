package it.epicode.U5_W1_D1.configuration;

import it.epicode.U5_W1_D1.bean.Drink;
import it.epicode.U5_W1_D1.bean.Topping;
import it.epicode.U5_W1_D1.enumerations.TipoDrink;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {

    @Bean //serve a far capire a Spring che questo metodo deve essere
    //chiamato automaticamente da Spring per creare un bean
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
}
