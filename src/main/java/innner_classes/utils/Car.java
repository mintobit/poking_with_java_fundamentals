package innner_classes.utils;

public class Car {
    private final Tire frontLeft;
    private final Tire frontRight;
    private final Tire rearLeft;
    private final Tire rearRight;

    public Car(Tire frontLeft, Tire frontRight, Tire rearLeft, Tire rearRight) {
        this.frontLeft = frontLeft;
        this.frontRight = frontRight;
        this.rearLeft = rearLeft;
        this.rearRight = rearRight;
    }

    public String tiresReport() {
        return String.format(
            "FL: %s\nFR: %s\nRL: %s\nRR: %s\n",
            frontLeft.getPressure(),
            frontRight.getPressure(),
            rearLeft.getPressure(),
            rearRight.getPressure()
        );
    }

    // Because Tire is static, it does not have access to outer object properties
    // You can declare inner static class Tire as private
    // This would restrict access to Tire (new Car.Tire() would no longer be available outside of Car)
    public static class Tire {
        private final Double pressure;

        public Tire(Double pressure) {
            this.pressure = pressure;
        }

        public Double getPressure() {
            return pressure;
        }
    }
}
