package products;

import interfaces.IOrderComponent;

public class SingleProduct implements IOrderComponent {
    private String name;
    private double price;

    public SingleProduct(String name, double price) {
        this.price = price;
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
