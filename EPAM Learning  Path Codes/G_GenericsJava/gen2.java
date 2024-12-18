package G_GenericsJava;

import java.util.ArrayList;

public class gen2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        String s = list.get(0);
        String s1 = list.get(1);
        /*
        * Generic types allow you to define a class, interface, or method with placeholders (type parameters)
        for the data types they will work with.

        *  This enables code reusability and type safety, as it allows you to create classes, interfaces, or methods
        that can operate on various types without needing to rewrite the code for each type.
        * */

    }
}
