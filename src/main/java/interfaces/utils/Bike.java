package interfaces.utils;

public class Bike implements Nameable {
    private final String name;

    public Bike(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
