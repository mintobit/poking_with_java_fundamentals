package lambdas;

import lambdas.utils.LengthProvider;
import lambdas.utils.RegularNameProvider;
import lambdas.utils.WelcomeService;

public class I1_Lambdas {
    public static void main(String[] args) {
        // By using RegularNameProvider object, we satisfy NameProvider interface contract
        WelcomeService service1 = new WelcomeService(new RegularNameProvider("Alex"));
        System.out.println(service1.message());

        // We use lambda function to satisfy the same NameProvider interface contract
        // This is possible because NameProvider interface is functional
        WelcomeService service2 = new WelcomeService(() -> "Kevin");
        System.out.println(service2.message());

        // Lambda expressions can have zero or more arguments
        LengthProvider provider1 = (String input) -> input.length();
        System.out.println(provider1.length("Hello"));

        // Lambda expressions body may have more than one expression
        LengthProvider provider2 = (String input) -> {
            int originalLength = input.length();
            return originalLength * 5;
        };
        System.out.println(provider2.length("World"));
    }
}
