package D_OOPS;


//import C_Class.Car;
import C_Class.c_DynamicInit;


@SuppressWarnings("ALL")
public class a_Encapsulation {
    public static void main(String[] arg) {
        b_Encapsulation  fastCar = new b_Encapsulation();
        //fastCar.speed = 100;// it gives error because it is private
        fastCar.setSpeed(100);
        System.out.println(fastCar.getSpeed());

        fastCar.setNumb(30);
        System.out.println(fastCar.getNumb());

        //Car c= new Car(); //gives error because the car is not public

        c_DynamicInit dnt=new c_DynamicInit();
        System.out.println(dnt.getA());
        System.out.println(dnt.getC());


    }
}