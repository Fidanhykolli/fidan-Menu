package fidanhykolli.u5d1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.List;
import java.util.Arrays;

@Configuration
public class AppConfig {
    @Bean
    public Menu menu() {
        List<Pizza> pizze = Arrays.asList(
                new Pizza("Margherita", 7.5, Arrays.asList("Mozzarella", "Pomodoro")),
                new Pizza("Diavola", 8.5, Arrays.asList("Mozzarella", "Pomodoro", "Salame Piccante")),
                new Pizza("Capricciosa", 9.5, Arrays.asList("Mozzarella", "Pomodoro", "Funghi", "Prosciutto Cotto", "Carciofi"))
        );
        List<Beverage> drinks = Arrays.asList(
                new Beverage("Acqua Naturale", 1.5),
                new Beverage("Coca Cola", 2.0),
                new Beverage("Birra", 3.0)
        );

        return new Menu(pizze, drinks);
    }

    @Bean
    public Topping pepperoni() {
        return new Topping("Pepperoni");
    }

    @Bean
    public Topping funghi() {
        return new Topping("Funghi");
    }


}
