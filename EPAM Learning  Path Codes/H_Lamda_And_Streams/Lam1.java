package H_Lamda_And_Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Lam1 {
    public static void funEx(){
        System.out.println("Hare Krishna at funEx...");
    }
    public static void main(String[] args) {
        funEx();
        LamIntf l1=()->"Hare Krishna at Lambda";
        System.out.println(l1.sayHareKrishna());

        //example doubt
        List<String> strings = Arrays.asList("abc", "cba", "test", "hello");
        Collections.sort(strings,  (String s1, String s2) -> {
            if (s1.length() < s2.length()) {
                return -1;
            } else if (s1.length() > s2.length()) {
                return 1;
            } else {
                return 0;
            }
        } );
        System.out.println(strings);

        List<Integer> ar=Arrays.asList(1,2,3,4);
        Collections.sort(ar, Collections.reverseOrder());
        System.out.println(ar);
        Collections.sort(ar,(a,b)->b-a);
        System.out.println(ar);
       // Collections.sort(ar);
        System.out.println(ar);



    }



}
