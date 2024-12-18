package H_Lamda_And_Streams;

/*
* BiPredicate, BiFunction and BiConsumer in Java 8 : takes two arguments
* */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class Lam6 {
    public static void main(String[] args) {
        BiPredicate<Integer,String> isDvo=(i,m)->  i>=16 && (m.toLowerCase()).trim().equals("hare krishna");
        System.out.println(isDvo.test(17,"hare krishna")); // true
        BiFunction<Integer,String,String> ch=(i,m)->isDvo.test(i,m)?"Hare Krishna Prabhu Ji":"Chant Hare Krishna and be Happy";
        System.out.println(ch.apply(17,"Hare Krishna"));

        /*
        * Agar jo function ka input type hai wahi function ka output typ hai then we use Unary Operator
        * lets see with an example
        * */

        UnaryOperator<String> wis=(str)->"Hare Krishna"+str;
        System.out.println("example of unary operator "+wis.apply(" Prabhu Ji"));

        //code of sum of squares
        List<Integer> arr= Arrays.asList(1,2,3,4,5);
        arr.forEach(Lam6::print);
        List<Integer> sql=arr.stream().map(x->x*x).collect(Collectors.toUnmodifiableList());
        sql.forEach(Lam6::print);

        Function<String, Person> stringToPerson = Person::new;
        Supplier<Person> personSupplier = Person::new;
//        Function<String> stringFunction = Person::new;
//        Supplier<String> stringSupplier = Person::new;

    }

    private static void print(Integer integer) {
        System.out.println(integer);
    }

}
class Person {
    public Person() {}
    public Person(final String name) {}
}


