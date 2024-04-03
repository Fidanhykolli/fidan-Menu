package fidanhykolli.u5d1;

import java.util.*;


public class Pizza {
    private String nome;
    private double prezzo;
    private List<String> toppings;

    public Pizza(String nome, double prezzo, List<String> toppings) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.toppings = toppings;
    }

    public String getNome() {
        return nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public List<String> getToppings() {
        return toppings;
    }
}