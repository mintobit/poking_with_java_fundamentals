package generics;

import generics.utils.*;

import java.util.function.Supplier;

public class I3_TypeParameterBounds {
    public static void main(String[] args) {
        int result = addFive(new ConstantValueContainer(10));
        System.out.println(result);

        int result1 = addFive(new RandomValueContainer());
        System.out.println(result1);

        int result3 = subtractFour(new ContantValueContainerWithCode("3D4", 5));
        System.out.println(result3);
    }

    // <T extends BoundingType> is a syntax for bounding type parameter T
    // Now this method only supports type T that is a subtype of ValueContainer
    // "extends" keyword is used for both classes and interfaces
    public static <T extends ValueContainer> int addFive(T valueContainer) {
        return valueContainer.getValue() + 5;
    }

    // Multiple bounding types are supported
    public static <T extends ValueContainer & CodeAware> int subtractFour(T valueContainer1) {
        return valueContainer1.getValue() - 4;
    }
}
