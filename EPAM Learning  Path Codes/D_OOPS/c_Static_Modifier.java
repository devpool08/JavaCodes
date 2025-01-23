package D_OOPS;

final class Car1 {
    private int numOfCars;// it is by default initialized by zero

    public static int getNumb() {
        return numb;
    }

    public static void setNumb(int numb) {
        Car1.numb = numb;
    }

    private static int numb;
    //other fields
    public Car1() {
        numOfCars++;
        numb++;
    }
    //other methods
    public int getNumOfCars() {
        return numOfCars;
    }
}
public class c_Static_Modifier {
    public static void main(String[] arg) {
        Car1 сar1 = new Car1();
        Car1 сar2 = new Car1();
        Car1 сar3 = new Car1();
        System.out.println(сar3.getNumOfCars());
        System.out.println(сar1.getNumb());

    }
}