package generics.utils;

// T is a type parameter
// You specify type parameter when instantiating a generic type
// For example, ItemHolder<Integer>
public class ItemHolder<T> {
    private final T item;

    public ItemHolder(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}
