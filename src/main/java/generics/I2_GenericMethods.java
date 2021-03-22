package generics;

public class I2_GenericMethods {
    public static void main(String[] args) {
        boolean result = isEqual("a", "c");
        System.out.printf("a is equal to c: %s\n", result);

        boolean result1 = isEqual(1, 1);
        System.out.printf("1 is equal to 1: %s\n", result1);
    }

    // Generic methods have type parameters, but they can be defined in regular (non-generic) classes
    public static <T> boolean isEqual(T first, T second) {
        return first.equals(second);
    }
}
