package fidanhykolli.u5d1;

public class Beverage {
    private String nome;
    private double prezzo;

    public Beverage(String nome, double prezzo) {
        this.nome = nome;
        this.prezzo = prezzo;
    }

    public String getNome() {
        return nome;
    }

    public double getPrezzo() {
        return prezzo;
    }
}