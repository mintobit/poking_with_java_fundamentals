package interfaces.utils;

public interface Nameable {
    // Because every interface property MUST BE public, static, final you can omit those keywords
    // You can also use those keywords for clarity
    String DEFAULT_NAME = "Example Name";

    default String getName() {
        return DEFAULT_NAME;
    }
}
