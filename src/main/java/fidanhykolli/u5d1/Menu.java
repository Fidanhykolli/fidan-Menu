package fidanhykolli.u5d1;

import fidanhykolli.u5d1.Beverage;

import java.util.*;


public class Menu {
    private List<Pizza> pizze;
    private List<Beverage> drinks;

    public Menu(List<Pizza> pizze, List<Beverage> drinks) {
        this.pizze = pizze;
        this.drinks = drinks;
    }

    public List<Pizza> getPizze() {
        return pizze;
    }

    public List<Beverage> getDrinks() {
        return drinks;
    }
}
