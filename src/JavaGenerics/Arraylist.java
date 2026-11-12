package JavaGenerics;

import java.util.ArrayList;

// Generic : Generics allow you to write classes, interfaces,
// and methods that work with different data types while maintaining type safety.

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        String s = list.get(0);
        String s1 = list.get(1);

    }
}