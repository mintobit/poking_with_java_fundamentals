package packages.utils.string.shorten;

public class MaxThreeSymbols {
    public static String execute(String input) {
        return input.substring(0, Math.min(input.length(), 3));
    }
}
