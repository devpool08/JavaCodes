package D_OOPS;
/*

abstract class Animal {
    public abstract void move();
}

class Reptiles extends Animal {  it will show an error message
}because abstract method is not implemented in the child class

*/
@SuppressWarnings("ALL")
abstract class Animal {
    public abstract void move();
    //public  abstract int i;// it will show an error message bcz there is
    // no such thing like abstract field
    public void xyz(){}
    //public void xyz(); it will show an error message bcz there is we cant
    // define method without abstract class
    public abstract void abc();
    //public void abc(); it will show an error message bcz there is we cant
}

abstract class Reptiles extends Animal {   }


@SuppressWarnings("ALL")
class Boa extends Reptiles {
    @Override
    public void move() {
        System.out.println("Boa move");
    }

    @Override
    public void abc() {
        System.out.println("demo");
    }
}

class Main {
    public static void mainM() {
        Animal animal = new Boa();
        animal.move();
    }
}
public class h_Abstraction {
    public static void main(String[] args) {
        Main.mainM();
    }

}
