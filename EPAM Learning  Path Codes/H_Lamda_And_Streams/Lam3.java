package H_Lamda_And_Streams;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

//Java 8 Predicates: AND, OR, and isEqual Explained with Examples
/*
* it's a boolean value function that returns a boolean value.
*
* */
public class Lam3 {
    public static void main(String[] args) {
        // Create two predicates
        Predicate<Integer> isDevotee = x -> x >= 16 ;//we are storing the condition in a variable here
        System.out.println("chanting 6 round isDevotee "+isDevotee.test(6));
        System.out.println("chanting 16 round isDevotee "+isDevotee.test(16));

        List<Integer> rounds= Arrays.asList(16,20,0,6,32,8,64,128);
        int dvo= (int) rounds.stream().filter(isDevotee).count();
        System.out.println("Total devotee is  "+dvo);
        //upper on eis equal to this
        int sum=0;
        for(int i : rounds){
            if(isDevotee.test(i))
                sum+=1;
        }
        System.out.println("Total devotee is  "+sum);

        Predicate<String> isDvo=x->x.toLowerCase().contains("hare krishna");
        //or Predicate<String> isDvo=x->x.toLowerCase().equals("hare krishna");
        List<String> names= Arrays.asList("Hare Krishna","hello buddy ","hey bro","hare krishna prabhu ji","radhe radhe", "hare krishna hare ram","aham bramahsmi" ,"whats up");
        int dvoName= (int) names.stream().filter(isDvo).count();
        System.out.println("Total devotee are  "+dvoName);

        Map<Integer,String> mp=new HashMap<>();
        int id=0;
        for (int i: rounds){
            mp.put(i,names.get(id));
            id++;
        }


    }
}
