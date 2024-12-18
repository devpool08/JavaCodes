package D_OOPS;

public class g_MethodOverloading {
    static void doJob(byte b) {  System.out.println("byte");  }
    static void doJob(Byte b) {  System.out.println("Byte");  }
    static void doJob(int i) {  System.out.println("int");  }
    static void doJob(double d) {  System.out.println("double");  }
    public static void main(String[] args) {
        byte b = 5;
        Byte bb = b;
        doJob(b);
        doJob(bb);
    }
}