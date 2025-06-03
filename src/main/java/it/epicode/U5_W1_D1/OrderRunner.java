package it.epicode.U5_W1_D1;

import it.epicode.U5_W1_D1.bean.Menu;
import it.epicode.U5_W1_D1.bean.Ordine;
import it.epicode.U5_W1_D1.bean.Tavolo;
import it.epicode.U5_W1_D1.enumerations.StatoOrdine;
import it.epicode.U5_W1_D1.enumerations.StatoTavolo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Arrays;

@Component
@Order(2)
@Slf4j
public class OrderRunner implements CommandLineRunner {

    @Autowired
    private Menu menu;

    @Value("${costo.coperto}")
    private double costoCoperto;

    @Override
    public void run(String... args) {
        // Crea tavolo
        Tavolo tavolo = new Tavolo();
        tavolo.setNumero(1);
        tavolo.setMaxCoperti(4);
        tavolo.setStato(StatoTavolo.OCCUPATO);

        // Crea ordine
        Ordine ordine = new Ordine();
        ordine.setNumeroOrdine(1001);
        ordine.setStato(StatoOrdine.IN_CORSO);
        ordine.setNumeroCoperti(2);
        ordine.setOraAcquisizione(LocalDateTime.now());
        ordine.setTavolo(tavolo);
        ordine.setCostoCoperto(costoCoperto);
        ordine.setElementiMenu(Arrays.asList(
                menu.getPizze().get(0), // Margherita
                menu.getDrinks().get(1) // Cola
        ));

        log.info("Ordine creato: {}", ordine);
        log.info("Totale ordine: €{}", ordine.getTotale());
    }
}