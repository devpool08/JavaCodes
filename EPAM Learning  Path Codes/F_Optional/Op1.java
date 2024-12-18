package F_Optional;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

public class Op1 {
    public static List<String> list = new ArrayList<>();
    public static void main(String[] args) {
        try{
            list.add("Shree Radhe");
            list.add("Shree Ram");
            list.add("Shree Krishna");
            list.add(null);
            Optional<String> str=getVal(0);
            if(str.isPresent()){
                System.out.println("Value at index 0 without any grt method " + str);
                System.out.println("Value at index 0 is: "+str.get());
            }else{
                System.out.println("Index is out of bounds");
            }

            str=getVal(2);
            str.ifPresent(System.out::println);
            //str.ifPresent(x-> System.out.println(x));upper expression is equal to this
            str=getVal(3);
            System.out.println();
            str.ifPresent(x-> System.out.println("null value is here "+x));//if null val is there this wouldn't be work.

            System.out.println("orElse use case "+str.orElse("Nahi mila Bhai"));
            str.orElseThrow(NoSuchElementException::new);

        } catch (Exception e) {
            System.out.println("At point 3 null is present so "+e+" is appear");
        }
    }
    public static Optional<String> getVal(int val){
        //return Optional.of(list.get(val));this means that you are confident that return value cant be null
        return Optional.ofNullable(list.get(val));//this means that this value may be null

    }
}
/*
* Optional in Java is a container object which may or may not contain a non-null value.
 It was introduced in Java 8 as a part of the functional programming paradigm.
* Optional provides methods to handle null values in a more graceful and
 safer way than traditional null checks.
* The main purpose of Optional is to prevent NullPointerException by providing a default value or
 throwing a meaningful exception when a null value is encountered.
* Optional has two main methods: isPresent() to check if a value is present, and get() to retrieve the value.
* To create an Optional object, you can use the Optional.of(value) method if you have a non-null value, or
 Optional.empty() if you want to create an empty Optional object.
 * You can also use the Optional.ofNullable(value) method, which will create an Optional object with a
  non-null value if the provided value is not null, or an empty Optional object if the value is null.
* */