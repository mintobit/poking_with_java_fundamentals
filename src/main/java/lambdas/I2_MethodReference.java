package lambdas;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class I2_MethodReference {
    public static void main(String[] args) {
        // Object::instanceMethod reference
        // Compiler treats this reference as if it is Supplier<Integer> welcomeMessageLengthProvider = () -> welcomeMessage.length();
        String welcomeMessage = "Welcome";
        Supplier<Integer> welcomeMessageLengthProvider = welcomeMessage::length;
        System.out.println(welcomeMessageLengthProvider.get());

        // Class::instanceMethod reference
        // Compiler treats this reference as if it is Function<String, String> stringChanger = (String input) -> input.toUpperCase();
        Function<String, String> stringChanger = String::toUpperCase;
        System.out.println(stringChanger.apply("hello"));

        // Class::staticMethod reference
        // Compiler treats this reference as if it is Function<Integer, String> numberToStringConverter = (Integer input) -> String::valueOf(input);
        int number = 10;
        Function<Integer, String> numberToStringConverter = String::valueOf;
        System.out.println(numberToStringConverter.apply(number));

        for (var i = 0; i < 10; i++) {
            int finalI = i;
            Supplier<Integer> s = () -> { return finalI; };
        }
    }
}
