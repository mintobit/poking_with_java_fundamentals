package generics;

import generics.utils.ItemHolder;

public class I1_GenericClass {
    public static void main(String[] args) {
        // Generic types have type parameters

        // ItemHolder<String> has String as its type parameter, this it will only accept strings
        ItemHolder<String> itemHolder = new ItemHolder<>("Hello");
        System.out.println(itemHolder.getItem());

        // ItemHolder<Double> has Double as its type parameter, this it will only accept double values
        ItemHolder<Double> itemHolder1 = new ItemHolder<>(2.34);
        System.out.println(itemHolder1.getItem());
    }
}
