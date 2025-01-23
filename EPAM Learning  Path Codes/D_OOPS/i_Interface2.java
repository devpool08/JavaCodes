package D_OOPS;
@SuppressWarnings("ALL")
interface Call {
    int NUM = 10;
    void сall();
}
@SuppressWarnings("ALL")
class Base {
    //int NUM = -5;
    int I=-8;
    public void сall() {
        System.out.println("сall() of class BASE: i = " + I);
    }
}
@SuppressWarnings("ALL")
class Client extends Base implements Call {
    public void сall() {
        System.out.println ("сall() of class Client inside the call method of interface: NUM =  " + NUM);
        super.сall();
    }
}
@SuppressWarnings("ALL")
interface Interface1 {
    int someField = 100;
    String someMethod();
}
@SuppressWarnings("ALL")
interface Interface2 {
    double someField = 200.5;
    String someMethod();
    //String someMethod(){return  "nhb";}//Interface abstract methods cannot have body
    //default void someMethod(); it will give you an error because  default method
    //must have a body
    public  static  void someMethod2(){//static methods also must have a body
        System.out.println("hello");
    }
}
@SuppressWarnings("ALL")
class SomeClass implements Interface2, Interface1 {
    @Override
    public String someMethod() {
        System.out.println("In interface2 = " + Interface2.someField );
        Interface2.someMethod2();
        return "It Works";
    }

}
@SuppressWarnings("ALL")
public class i_Interface2 {
    public static void main(String[] args) {
        Call object = new Client();
        object.сall();
        SomeClass obj = new SomeClass();
        System.out.println( "1 "+obj.someMethod() );
        System.out.println("2 "+ ( (Interface2)obj).someMethod() );
        System.out.println("3 "+ ( (Interface1)obj).someField );
        System.out.println( "4 "+Interface1.someField );
    }
}