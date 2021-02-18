package packages.utils.string;

public class PrependRandomNumber {
    public static final int MULTIPLIER = 100;

    public static String execute(String input) {
        return Long.valueOf(Math.round(Math.random() * MULTIPLIER)).toString() + input;
    }
}
