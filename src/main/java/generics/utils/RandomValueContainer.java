package generics.utils;

public class RandomValueContainer implements ValueContainer {
    @Override
    public int getValue() {
        return Double.valueOf(Math.random() * 100).intValue();
    }
}
