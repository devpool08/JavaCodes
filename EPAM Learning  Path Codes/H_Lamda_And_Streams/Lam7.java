package H_Lamda_And_Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lam7 {
    public static void main(String[] args) {

        List<String> lst= Arrays.asList("KRISHNA ,"," GOPAL , ","MADHAV , ","KESHAV , ","DAMODAR , ","AJIT");
        Stream<String> str=lst.stream();//
        str.forEach(System.out::print);
        System.out.println();

        String[] lst2={"KRISHNA ,"," GOPAL , ","MADHAV , ","KESHAV , ","DAMODAR , ","AJIT"};
        Stream<String> str2 = Arrays.stream(lst2);
        str2.forEach(System.out::print);
        System.out.println();

        Stream<String> str3=Stream.of("KRISHNA ,"," GOPAL , ","MADHAV , ","KESHAV , ","DAMODAR , ","AJIT");
        str3.forEach(System.out::print);
        System.out.println();

        (Stream.generate(()->"Hare Krishna").limit(16)).forEach(System.out::println);

        Stream<Integer> ren=Stream.generate(()->(int) (Math.random()*20)).limit(10);
        ren.forEach(x -> System.out.print(x+","));
        System.out.println();

    }
}
