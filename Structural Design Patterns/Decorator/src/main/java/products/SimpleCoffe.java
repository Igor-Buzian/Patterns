package products;

import interfaces.Beverage;

public class SimpleCoffe implements Beverage {
    private String description;
    private double price;

    public SimpleCoffe(String description, double price) {
        this.description = description;
        this.price = price;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getCost() {
        return price;
    }
}
