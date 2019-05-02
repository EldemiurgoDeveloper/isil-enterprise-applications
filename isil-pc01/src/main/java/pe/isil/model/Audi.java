package pe.isil.model;

public class Audi implements ICar {

    private String name = "Audi";
    private Double price = new Double("70000");

    public String getDescription() {
        return String.format("name: %s, price: $%.2f", name, price);
    }
}
