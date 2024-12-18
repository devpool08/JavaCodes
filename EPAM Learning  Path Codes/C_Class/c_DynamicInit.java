package C_Class;


////////////////////////////////      DOUBT         ///////////////////////////////////

public class c_DynamicInit {
    private int a = 5;
    private static int b = 100;
    protected  static int c =90;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
    public static int getC() {
        return c;
    }

    public static void setC(int c) {
        c_DynamicInit.c = c;
    }


    {
        a = -5;
        System.out.println("Dynamic initialization section");
    }
    public c_DynamicInit() {
        a = 10;
        b = 10;
        System.out.println("Constructor");
    }
    static {
        b = -5;
        System.out.println("Static initialization section");
    }
    public static void main(String[] arg) {
        System.out.println("Main");
        c_DynamicInit obj = new c_DynamicInit();
        System.out.println("a=" + obj.a + " b=" + b);
    }
}