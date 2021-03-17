package lambdas.utils;

public class WelcomeService {
    private final NameProvider nameProvider;

    public WelcomeService(NameProvider nameProvider) {
        this.nameProvider = nameProvider;
    }

    public String message() {
        return String.format("Welcome, %s", nameProvider.getName());
    }
}
