package fidanhykolli.u5d1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class U5d1Application {

	public static void main(String[] args) {
		SpringApplication.run(U5d1Application.class, args);


		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);


		Menu menu = context.getBean(Menu.class);


		System.out.println("PIZZE:");
		for (Pizza pizza : menu.getPizze()) {
			System.out.println(pizza.getNome() + " - " + pizza.getPrezzo());
			System.out.println("Toppings: " + pizza.getToppings());
			System.out.println();
		}

		System.out.println("BEVANDE:");
		for (Beverage drink : menu.getDrinks()) {
			System.out.println(drink.getNome() + " - " + drink.getPrezzo());
		}


		context.close();
	}

}
