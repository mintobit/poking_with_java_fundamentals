package lambdas.utils;

public class RegularNameProvider implements NameProvider {
    private final String name;

    public RegularNameProvider(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
