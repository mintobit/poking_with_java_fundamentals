package lambdas;

import java.util.Locale;
import java.util.function.Function;
import java.util.function.Supplier;

public class I3_VariableScope {
    public static void main(String[] args) {
        // Variables can be captured by lambda expressions
        String message = "Hello";
        Supplier<String> messageProvider = () -> {
            return message.toUpperCase();
        };
        System.out.println(messageProvider.get());

        // Variables that are captured must be effectively final
        String message1 = "Hello";
        // The following statement would result in error
        // message1 = "replacement";
        Supplier<String> messageProvider1 = () -> {
            return message1.toUpperCase();
        };
        System.out.println(messageProvider1.get());
    }
}
