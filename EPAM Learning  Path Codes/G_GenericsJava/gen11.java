package G_GenericsJava;

import java.util.Arrays;

/*
*              Generic method and generic constructor
* */
class box11 {
    public <T extends Number> box11(T val){
        System.out.println("Box constructor: " + val);
    }
}
public class gen11 {
    public static void main(String[] args) {
        box11 b1 = new box11(10);
        box11 b2 = new box11(10.5);

        gen11 g = new gen11();
        Integer[] intArray = {1,2,3,4,5};
        Double[] doubleArray = {1.1,2.2,3.3,4.4,5.5};//double[] doubleArray = {1.1,2.2,3.3,4.4,5.5}; this will show an error
        String[] str={ "one", "two", "three", "four", "five"};
        g.fun(intArray);
        g.fun(doubleArray);
        g.fun(str);

    }
    public  <T> void fun(T[] param){
        for(T i: param){
            System.out.print(i+",");
        }
        System.out.println();
    }
//    public void fun(Integer[] param){// public void fun(int[] param){ it will not run
//        System.out.println("array method called...");
//        System.out.println(Arrays.toString(param));
//    }
}
