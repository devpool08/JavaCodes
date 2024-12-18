package G_GenericsJava;

import java.util.ArrayList;

public class gen13 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list1.add(i);
        }
        gen13 gen = new gen13();
        System.out.println("First element of list1: " + gen.getFirst(list1));
        System.out.println("list2: " + list2);
        System.out.println("Copy of list1: " + gen.copy(list1, list2));
        System.out.println("list2: " + list2);
        System.out.println("Sum of list1: " + sum(list1));

    }

    public <T> T getFirst(ArrayList<T> list) {
        return list.get(0);
    }
    public <T> ArrayList<T> copy(ArrayList<T> list1,ArrayList<T> list2) {
        //list2.addAll(list1);
        for (T t : list1) {
            t=(T) t;
            list2.add(t);
        }
        return list2;
    }
    public  static double sum(ArrayList<? extends Number> arr){
        double sum = 0;
        for(Number i: arr){
            sum += i.doubleValue();
        }
        return sum;
    }
    public  static void print(ArrayList<? super Integer> arr){
        for(Object i: arr){
            System.out.println(i);
        }
    }
}
