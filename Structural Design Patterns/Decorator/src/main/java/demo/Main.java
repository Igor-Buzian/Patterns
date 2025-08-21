package demo;

import decorator.BeverageDecorator;
import decorator.MilkDecorator;
import decorator.SugarDecorator;
import interfaces.Beverage;
import products.SimpleCoffe;

public class Main {
    public static void main(String[] args) {
        SimpleCoffe coffe = new SimpleCoffe("Basic Coffe",5);

        System.out.println("Order 1:");
        System.out.println("Description: " + coffe.getDescription());
        System.out.println("Cost: $" + coffe.getCost());

        System.out.println("\n----------------------------------\n");

        // Order 2: Coffee with milk
        Beverage milkDecorator = new MilkDecorator(coffe);
        System.out.println("Order 2:");
        System.out.println("Description: " + milkDecorator.getDescription());
        System.out.println("Cost: $" + milkDecorator.getCost());

        System.out.println("\n----------------------------------\n");

        // Order 3: Coffee with milk
        Beverage sugarDecorator = new SugarDecorator(coffe);
        System.out.println("Order 3:");
        System.out.println("Description: " + sugarDecorator.getDescription());
        System.out.println("Cost: $" + sugarDecorator.getCost());

        System.out.println("\n----------------------------------\n");

        // Order 4: Coffee with milk and sugar
        Beverage coffeWithMilkAndSugar = new SugarDecorator(new MilkDecorator(new SimpleCoffe("Coffe Caramel",6)));
        System.out.println("Order 4:");
        System.out.println("Description: " + coffeWithMilkAndSugar.getDescription());
        System.out.println("Cost: $" + coffeWithMilkAndSugar.getCost());
    }
}