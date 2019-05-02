package pe.isil.model;

public class Mercedes implements ICar {

    private String name = "Mercedes";
    private Double price = new Double("60000");

    public String getDescription() {
        return String.format("name: %s, price: $%.2f", name, price);
    }
}
