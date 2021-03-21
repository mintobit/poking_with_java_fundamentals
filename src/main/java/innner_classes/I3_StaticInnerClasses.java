package innner_classes;

import innner_classes.utils.Car;

public class I3_StaticInnerClasses {
    public static void main(String[] args) {
        Double pressure = 2.3;
        // Static inner class can be instantiated through class (without having object instance)
        Car.Tire frontLeft = new Car.Tire(pressure);
        Car.Tire frontRight = new Car.Tire(pressure);
        Car.Tire rearLeft = new Car.Tire(pressure);
        Car.Tire rearRight = new Car.Tire(pressure);

        Car car = new Car(frontLeft, frontRight, rearLeft, rearRight);
        System.out.println(car.tiresReport());
    }
}
