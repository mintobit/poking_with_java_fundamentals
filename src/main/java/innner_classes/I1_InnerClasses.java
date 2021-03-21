package innner_classes;

import innner_classes.utils.Bin;

public class I1_InnerClasses {
    public static void main(String[] args) {
        Bin bin = new Bin("Fruits");
        Bin.Item item = bin.getItem(0);

        // Check out Bin.Item::belongsTo implementation
        System.out.println(String.format("Item %s belongs to bin %s", item.code(), item.belongsTo()));

        // inner class instantiation syntax outside of outer class
        // note that bin instance is required and item still has access to "name" property of the bin
        Bin.Item item1 = bin.new Item("orange #4");
        System.out.println(String.format("Item %s belongs to bin %s", item1.code(), item1.belongsTo()));
    }
}
