package creational.builderPattern.builderpattern;

import creational.builderPattern.builderpattern.builders.CarBuilder;
import creational.builderPattern.builderpattern.builders.CarManualBuilder;
import creational.builderPattern.builderpattern.cars.Car;
import creational.builderPattern.builderpattern.cars.Manual;
import creational.builderPattern.builderpattern.director.Director;

public class Run {

    public static void main(String[] args){
        Director director = new Director();

        // Director gets the concrete builder object from the client
        // (application code). That's because application knows better which
        // builder to use to get a specific product.
        CarBuilder builder = new CarBuilder();
        director.constructCityCar(builder);

        // The final product is often retrieved from a builder object, since
        // Director is not aware and not dependent on concrete builders and
        // products.
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());

        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());

        CarManualBuilder manualBuilder1 = new CarManualBuilder();
        director.constructSUV(manualBuilder1);
        Manual carManual1 = manualBuilder1.getResult();
        System.out.println("\nCar manual built:\n" + carManual1.print());
    }
}
