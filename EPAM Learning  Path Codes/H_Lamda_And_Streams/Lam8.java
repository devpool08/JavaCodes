package H_Lamda_And_Streams;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

record Transaction(Integer id, String type, Double value) {
}
public class Lam8 {
    public static void main(String[] args) {
        List<Transaction> transactions = Arrays.asList(
                new Transaction(123, "income", 15.0),
                new Transaction(124, "income", 25.0),
                new Transaction(125, "expense", 132.0),
                new Transaction(126, "income", 20.0));

        List<Transaction> incomeTransactions = new ArrayList<>();
        for (Transaction t: transactions) {
            if (t.type().equals("income")) {
                incomeTransactions.add(t);
            }
        }
        Collections.sort(incomeTransactions, new Comparator< Transaction >() {
            public int compare(Transaction t1, Transaction t2) {
                return t2.value().compareTo(t1.value());
            }
        });
        List < Integer > transactionsIds = new ArrayList<>();
        for (Transaction t: incomeTransactions) {
            transactionsIds.add(t.id());
        }

        System.out.println(transactionsIds);


        List<Integer> transactionsIds2 = transactions.stream()
                .filter(t -> t.type().equals("income"))
                .sorted(comparing(Transaction::value).reversed())
                .map(Transaction::id)
                .collect(Collectors.toList());

        System.out.println(transactionsIds2);

    }
}
