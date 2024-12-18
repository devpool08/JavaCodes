package H_Lamda_And_Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/*
* Java 8 Function Interface Explained: How to Use apply(), andThen(), compose() and identity()
*Function perform some function
*
* */
public class Lam4 {
    public static void main(String[] args) {
        Function<String,String> fn1=(str)->str;//used to store the function
        System.out.println(fn1.apply("Hare Krishna"));
        Function<String,String> fn2=str->"Chant "+str.toUpperCase()+" and be Happy";//used to transform the function
        System.out.println(fn1.andThen(fn2).apply("Hare Krishna"));
        Function<List<Integer>,List<Integer>> square=(lst)->{
            List<Integer> lst2 = new ArrayList<Integer>();
            for(int i: lst){
                lst2.add(i*i);
            }
            return lst2;
        };
        Function<List<Integer>,Integer> sumOfSquares=(lst)->{
            int sum=0;
            for(int i: lst){
                sum+=i;
            }
            return sum;
        };
        List<Integer> numbers=List.of(1,2,3,4,5);
        System.out.println("Before Transformation: "+numbers);
        System.out.println("After Transformation: "+square.apply(numbers));
        System.out.println("Sum of squares: "+square.andThen(sumOfSquares).apply(numbers));

    }


}
