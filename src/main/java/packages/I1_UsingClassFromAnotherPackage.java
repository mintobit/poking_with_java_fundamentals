package packages;

// Importing the class so that it is accessible by classname without package name
import packages.utils.string.ToUpper;

public class I1_UsingClassFromAnotherPackage {
    public static void main(String[] args) {
        // Using class from package without import
        System.out.println(packages.utils.integer.Multiply.execute(2, 5));
        // Using class from package by importing it beforehand
        System.out.println(ToUpper.execute("hello"));
    }
}
