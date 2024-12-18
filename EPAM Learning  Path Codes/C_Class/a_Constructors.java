package C_Class;
class Example {
    int value;

    Example(int value) {
        this.value = value;
    }


    void display(Example obj) {
        System.out.println("Value: " + obj.value);
    }

    void callDisplay() {
        // Passing 'this' as an argument to the display method
        display(this);
    }


}
class  Car{

}
class InitDemo3 {
    //...
    private static byte by = 17;
    public static int ii  = by*2 ;

    //...
}

class Example2 {
    int value;
    String name;

    // Constructor 1
    Example2(int value) {
        this.value = value;
    }

    // Constructor 2, calling Constructor 1 using 'this'
    Example2(int value, String name) {
        this(value);  // Calling the single parameter constructor
        this.name = name;
    }

    void display() {
        System.out.println("Value: " + value + ", Name: " + name);
    }
}
class Example3 {
    public void display() {
        System.out.println("Display method called");
    }
}


public class a_Constructors {
    public static void main(String[] args) {
        Example example = new Example(42);
        example.callDisplay();  // Output: Value: 42

        // Creating an object using the two-parameter constructor
        Example2 example2 = new Example2(42, "John");
        example2.display();  // Output: Value: 42, Name: John
        new Example(32);
        //98;
        String str1 = null;
        Car car1 = null;
        String str2 = (String)null;
        Car car2 = (Car)null;
        System.out.println(null == null);
        System.out.println(car1 == null);
        System.out.println(car1 != car2);
        String srt=null;
        //System.out.println(str1==car1); // error
        //System.out.println( str2.equals(car2)); // error

        Example3 obj = null;  // obj is a null reference

        // Trying to call an instance method using a null reference
        //obj.display();  // This will throw a NullPointerException

        InitDemo3 init = new InitDemo3();
        System.out.println(InitDemo3.ii);  // Output: 392
    }


}

