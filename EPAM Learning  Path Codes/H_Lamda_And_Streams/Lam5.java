package H_Lamda_And_Streams;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/*
* Consumer Interface and Supplier Interface
*
* */
public class Lam5 {
    public static void main(String[] args) {
        Consumer<String> dev=(str)-> System.out.println(str+" Hare Ram");
        dev.accept("Hare Krishna"); // Outputs: Hello World
        Consumer<String> dev1=(str)-> System.out.println("Chant "+str+" And Be Happy");
        dev1.andThen(dev).accept("Hare Krishna");

        System.out.println();
        System.out.println();

        Predicate<Integer> isDvo=(r)-> r>=16;
        Function<Integer, String> ch = (r) -> isDvo.test(r) ? "Hare Krishna Prabhu ji" : " Chant Hare Krishna And Be Happy";
        Consumer<String> msg=(str)-> System.out.println(str);
        Supplier<Integer> rnd=()->16;
        Supplier<Integer> rnd2=()->3;
        msg.accept(ch.apply(rnd.get()));
        msg.accept(ch.apply(rnd2.get()));
    }
}
