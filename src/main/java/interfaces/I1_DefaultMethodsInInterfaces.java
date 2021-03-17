package interfaces;

import interfaces.utils.Bike;
import interfaces.utils.Car;

public class I1_DefaultMethodsInInterfaces {
    public static void main(String[] args) {
        // uses default implementation from Nameable::getName
        Car car = new Car();
        System.out.println(car.getName());

        // overrides default implementation from Nameable::getName
        Bike bike = new Bike("Cannondale");
        System.out.println(bike.getName());
    }
}
