package I_InnerClass;
//without using Inner classes
public class IC2 {
    private  IC1 car;

    public IC2(IC1 car) {
        this.car = car;
    }

    public void startEngine() {
        if(car.isActive){
            System.out.println(car.model+" engine is activated already");
        }
        else{
            car.isActive=true;
            System.out.println(car.model+" engine is now started");
        }
    }

    public void stopEngine() {
        if(car.isActive){
            car.isActive=false;
            System.out.println( car.model+ " engine is now stopped");
        }
        else{
            System.out.println(car.model+" engine is already stopped");
        }

    }

    public static void main(String[] args) {
        IC1 myCar = new IC1("maclaren");
        IC2 myCarObj = new IC2(myCar);
        myCarObj.startEngine();
        myCarObj.stopEngine();

        IC1 myCar2 = new IC1("ford");
        //IC1.Engine car3 = new IC1.Engine(); we cant access it because it is non-static class

    }

}
