package interfaces.utils;

public class Item implements Ordered {
    @Override
    public int order() {
        return 10;
    }
}
