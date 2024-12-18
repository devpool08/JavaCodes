package H_Lamda_And_Streams;
interface Parent{
    public String sayHareKrishna();
}
@FunctionalInterface
public interface LamIntf extends Parent {
    public String str="Hare";
    default void sayRadheKrishna(){
        System.out.println("Radhe Krishna");
    }//if we make this public type it will show error
    static void sayRadheShyam(){
        System.out.println("Radhe Shyam");
    }//if we make this public type it will show error
}
