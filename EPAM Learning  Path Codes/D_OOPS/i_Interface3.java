package D_OOPS;

interface FlyingMachine  {
    void blastOff();
    void landing();
    default void makeTravel() {
        blastOff();
        fly();
        landing();
    }
    default void fly() {
        System.out.println("Machine is flying!");
    }
}
class Plane implements FlyingMachine  {
    @Override
    public void blastOff() {
        System.out.println("The plane is blasting off");
    }
    @Override
    public void landing() {
        System.out.println("The plane is landing");
    }

}
public class i_Interface3 {
    public static void main(String[] args) {
        FlyingMachine plane = new Plane();
        plane.makeTravel();
    }
}