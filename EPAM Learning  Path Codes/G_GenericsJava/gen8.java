package G_GenericsJava;

public interface gen8<T extends Number> {
    /*this is called as bounded type interface declare a condition that T must be a number type
    if we define T as char or string type or boolean type it show a compilation error
    */
    void add(T item);
    T get();
}