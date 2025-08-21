package demo;

import interfaces.IOrderComponent;
import products.ProductSet;
import products.SingleProduct;

public class Main {
    public static void main(String[] args) {
        IOrderComponent apples = new SingleProduct("Apples",3.5);
        IOrderComponent phone = new SingleProduct("Xiaomi",300.0);
        IOrderComponent IPhone = new SingleProduct("IPhone 17",1300.0);

        ProductSet electronicTechnique = new ProductSet("electronica");
        electronicTechnique.addComponent(apples);
        electronicTechnique.addComponent(phone);
        electronicTechnique.addComponent(IPhone);
        electronicTechnique.addComponent(new SingleProduct("POCO",500));

        System.out.println("Customer Order: " + electronicTechnique.getName());
        System.out.println("Total price: $" + electronicTechnique.getPrice());

        electronicTechnique.removeComponent(apples);
        System.out.println("After remove Apples");
        System.out.println("Customer Order: " + electronicTechnique.getName());
        System.out.println("Total price: $" + electronicTechnique.getPrice());

    }
}
