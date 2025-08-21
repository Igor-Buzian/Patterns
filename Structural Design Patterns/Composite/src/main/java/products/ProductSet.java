package products;

import interfaces.IOrderComponent;

import java.util.ArrayList;
import java.util.List;

public class ProductSet implements IOrderComponent {
    private String name;
    private List<IOrderComponent> products = new ArrayList<>();

    public ProductSet(String name) {
        this.name = name;
    }

    public void addComponent(IOrderComponent orderComponent){
        products.add(orderComponent);
    }
    public void  removeComponent(IOrderComponent orderComponent){
        products.remove(orderComponent);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
       int totalPrice =0;
       for(IOrderComponent component : products){
          totalPrice += component.getPrice();
       }
       return totalPrice;
    }
}
