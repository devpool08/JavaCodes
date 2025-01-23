package G_GenericsJava;


@SuppressWarnings("ALL")
class IntegerContainer<T extends Number> implements gen8<T> {
    private T item;

    @Override
    public void add(T item) {
        this.item = item;
    }

    @Override
    public T get() {
        return item;
    }
}
@SuppressWarnings("ALL")
public class gen9 {
    public static void main(String[] args) {
        IntegerContainer<Integer> integerContainer = new IntegerContainer<>();
        integerContainer.add(10);
        System.out.println(integerContainer.get());

        IntegerContainer<Double> doubleContainer = new IntegerContainer<>();
        doubleContainer.add(3.14);
        System.out.println(doubleContainer.get());

        // Error: compile-time type mismatch
        // IntegerContainer<String> stringContainer = new IntegerContainer<>();
        // stringContainer.add("Hello");
        // System.out.println(stringContainer.get()); // This will throw a compile-time error
        /*
        * as per condition we cant define T as String type because it is not supported by Number class
        * */

    }
}
