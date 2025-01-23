package G_GenericsJava;

@SuppressWarnings("ALL")
interface Igen10{
    void print();
}
class MyNum extends Number implements  Igen10{
    private final int value;
    MyNum(int value){this.value = value;}
    @Override
    public void print() {
        System.out.println("Value: " + value);
    }

    @Override
    public int intValue() {
        return value;
    }

    @Override
    public long longValue() {
        return value;
    }

    @Override
    public float floatValue() {
        return value;
    }

    @Override
    public double doubleValue() {
        return value;
    }
}
@SuppressWarnings("ALL")
class demo<T extends Number &  Igen10>{
    /*class demo<T extends Igen10 &Number>{}:
     * This will Cause an error because multiple inheritance not allowed in java
     * so it basically says first you first define, and then you define interface as per your requirements
     * Here if we ony implement igen10 in that case also we need to write  class demo<T extends Igen10>
     * because in generic classes we need to write in extend format in bounded interface
     * */
    private T i;
    demo(T i){
        this.i = i;
    }
    public void display(){
        i.print();
    }


}
@SuppressWarnings("ALL")
public class gen10 {
    public static void main(String[] args) {
        MyNum myNum=new MyNum(10);
        demo<MyNum> d=new demo<>(myNum);
        d.display(); //prints Value: 10
    }
}

