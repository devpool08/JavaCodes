package H_Lamda_And_Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Lam9 {
    public static void main(String[] args) {
        Predicate<Integer> isDone=(r)->r>=16;
        Consumer<Integer> next=(r)-> System.out.print(r+",");
        List<Integer> rounds = Arrays.asList(1008,1,4,15,16,34,32,12,15,11,45,66,4,6,9,60,23,64,11,10,5,7,92,13,8,7,6,108,5,6,7,192);
        List<Integer> vai = rounds.stream()
                .filter(isDone)
                .toList();
        List<Integer> sortedVai = rounds.stream()
                .map(x->x+1)
                .filter(isDone)
                .sorted((a,b)->b-a)
                .distinct()
                .peek(next)
                .skip(1)//how many element from the first to skip
                .toList();
        System.out.println();
        long count = rounds.stream()
                .filter(isDone).count();
        vai.forEach(x-> System.out.print(x+","));
        System.out.println();
        sortedVai.forEach(next);
        System.out.println();
        System.out.println("total is "+ count);
    }
}
