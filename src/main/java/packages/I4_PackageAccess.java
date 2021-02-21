package packages;

import packages.utils.integer.Multiply;

public class I4_PackageAccess {
    public static void main(String[] args) {
        // We can not access this class because it does not have `public` access modifier
        // Classes without this access modifier are "package private" (accessible only by members of its package)
        // packages.utils.integer.DivideBy2.execute(10);

        // class packages.utils.integer.Multiply is accessible because it has `public` access modifier
        System.out.println(Multiply.execute(10, 2));
    }
}
