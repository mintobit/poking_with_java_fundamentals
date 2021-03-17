package interfaces.utils;

public interface Ordered {
    // interface methods are public by default, so you can omit "public" keyword or keep it for clarity
    int order();

    default String unitName() {
        return defaultUnitName();
    }

    // interface can have private methods
    private String defaultUnitName() {
        return "second";
    }
}
