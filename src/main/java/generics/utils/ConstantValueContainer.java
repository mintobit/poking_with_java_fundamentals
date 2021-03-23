package generics.utils;

public class ConstantValueContainer implements ValueContainer {
    private final int value;

    public ConstantValueContainer(int value) {
        this.value = value;
    }

    @Override
    public int getValue() {
        return value;
    }
}
