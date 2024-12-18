package D_OOPS;

interface OperateCar {
    void startEngine();
   public abstract void stopEngine();
}
interface Parkable {
    void park();
}
interface Moveable {
    void move();
}


class Car2 implements OperateCar, Parkable, Moveable {
    @Override
    public void move() {

    }

    @Override
    public void startEngine() {

    }

    @Override
    public void stopEngine() {

    }

    @Override
    public void park() {

    }
}
// …
// Superclass with a method
class Animal2 {
    //public void hello(); this will show error
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Interface with the same method signature
interface SoundMaker {
    void makeSound();
    //void abc();//this will show error

}

// Dog class implements the interface and inherits from Animal
class Dog extends Animal2 implements SoundMaker {
    // No explicit override here; the superclass method is not hidden

    public static void main2() {
        Dog myDog = new Dog();
        myDog.makeSound(); // Calls the Animal's makeSound() method
    }
}


public class i_Interface {
    public static void main(String[] args) {
        OperateCar сar = new Car2 ();
        Parkable park = (Parkable) сar;
        Moveable mov = (Moveable) сar;
        Dog.main2();
    }
}
