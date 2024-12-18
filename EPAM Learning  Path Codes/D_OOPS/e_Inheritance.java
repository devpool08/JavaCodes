package D_OOPS;

class Car {
    private String name;
    public void setName(String name) {
        this.name = name;
    }
    public void show() {
        System.out.println("Name: " + name);
    }
    protected void show1() {
        System.out.println("Hare Krishna");
    }
}
class ElectricCar extends Car {
    @Override
    public void show1() {
        super.show1();
    }
}
public class e_Inheritance {
    public static void main(String[] args) {
        Car car = new Car();
        car.setName("Wheels");
        car.show();
        ElectricCar electricCar = new ElectricCar();
        electricCar.setName("Lightning");
        electricCar.show();
        electricCar.show1(); // inherited method from Car class
    }
}