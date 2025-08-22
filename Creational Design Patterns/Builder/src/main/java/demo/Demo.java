package demo;

import builder.CarBuilder;
import builder.CarManualBuilder;
import model.Car;
import model.Manual;

public class Demo {

    public static void main(String[] args) {
        Director director = new Director();

        // The director receives a concrete builder object from the client
        // (application). The application knows which builder to use
        // to get the desired product.
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        // The builder returns the finished product, as the Director
        // often doesn't know about or depend on the concrete builder
        // and product classes.
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getType());


        CarManualBuilder manualBuilder = new CarManualBuilder();

        // The director can have more than one construction recipe.
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }

}