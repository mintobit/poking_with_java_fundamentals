package innner_classes.utils;

import java.util.ArrayList;
import java.util.List;

public class Bin {
    private final String name;
    private List<Item> items = new ArrayList<>();

    public Bin(String name) {
        this.name = name;
        this.items.add(new Item("apple #2"));
    }

    public Item getItem(int index) {
        return items.get(index);
    }

    // You can declare inner class Item as private
    // This would restrict access to Item (bin.new Item would no longer be available outside of Bin)
    // Static methods are not allowed within inner classes
    // Any static properties declared in an inner class must be final and initialized with a compile-time constant
    public class Item {
        private final String code;

        public Item(String code) {
            this.code = code;
        }

        public String code() {
            return code;
        }

        // inner class has access to outer class properties
        public String belongsTo() {
            // this is equivalent to Bin.this.name
            return name;
        }
    }
}
