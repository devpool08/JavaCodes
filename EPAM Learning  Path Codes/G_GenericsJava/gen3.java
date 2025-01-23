package G_GenericsJava;


@SuppressWarnings("ALL")
class Box<T> { //  one or more type parameters
    //  These type parameters are placeholders that are replaced with specific types when the class is instantiated.
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    /*
    In this example of the testInstance() method, an object of the Т type is created. However,
    it is unknown what will be included instead of this type as a result of compilation.
    public static <T>  T testInstance() {
    private static T os;//error cant be static type
    T elem = new T();//new T();error
    return elem;
   }
    * */
}
@SuppressWarnings("ALL")
public class gen3 {
    public static void main(String[] args) {
        Box<Integer> box = new Box<>();  // Box is now type-safe
        box.setValue(1);  // No issue, it's an Integer
        Integer i = box.getValue();  // No casting needed
        System.out.println(i);
    }
}
////////////////////////////////////////////////   ISSUE     ///////////////////////////////////////////////////////////
/*
public class Box {
    private Object value;

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}

public class Main {
    public static void main(String[] args) {
        Box box = new Box();
        box.setValue(1);
       or box.setValue("dhf");  //we can set data of any type
        String i = (String) box.getValue(); // EXCEPTION !!!
        System.out.println(i);
    }
}
*here we don't specify the type of data so we have to cast it according to the data
 */