package packages;

// Importing all classes from package `packages.utils.string`
import packages.utils.string.*;
// Packages packages.utils.string and packages.utils.string.shorten do not have parent/child relationship even though directories are nested
// Each package is completely separate from compiler's point of view
// This is why importing packages.utils.string.* includes all classes from packages.utils.string, but not from packages.utils.string.shorten
import packages.utils.string.shorten.MaxThreeSymbols;

public class I2_ImportingAllClassesFromAnotherPackage {
    public static void main(String[] args) {
        System.out.println(PrependRandomNumber.execute(MaxThreeSymbols.execute(ToUpper.execute("Hello"))));
    }
}
