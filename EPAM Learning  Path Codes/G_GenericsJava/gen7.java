package G_GenericsJava;

class GenericContainer<T> implements gen5<T> {
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
public class gen7 {
    public static void main(String[] args) {
        GenericContainer<String> container = new GenericContainer<>();
        container.add("Hare Krishna");
        System.out.println(container.get());
    }
}
