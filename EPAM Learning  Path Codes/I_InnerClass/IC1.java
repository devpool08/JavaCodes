package I_InnerClass;
///////////////////////   IC1 And IC2 is member inner class example        /////////////////////
public class IC1 {//assume this class as a Car
    protected   String model;
    protected   boolean isActive;
    public IC1(String model){
        this.model = model;
        this.isActive = false;
    }
    class Engine {//This class is also a member of IC1 class like isActive and model
        void start() {
            if (!isActive) {
                isActive=true;
                System.out.println(model+"engine started");
            }
            if (isActive) {
                System.out.println(model+"Engine is already on brun brun brunnnn..................");
            }
        }
        void stop() {
            if(isActive) {
                isActive = false;
                System.out.println(model+"engine stopped");
            }
            else {
                System.out.println(model+"Engine is already off");
            }
        }
    }

    public static void main(String[] args) {
        IC1 car = new IC1("Toyota");
        IC1.Engine engine = car.new Engine();//creating object of inner class with the help of outer class
        engine.start();
        engine.stop();
        IC1.Engine ob=new IC1("Lambo ").new Engine();
        ob.start();
        ob.stop();
    }
}
