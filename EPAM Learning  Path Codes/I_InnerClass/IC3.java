package I_InnerClass;
//////////////////////////   This is an example of Static Inner Class  /////////////////////////////
class Computer{
    private String brand;
    private  String model;

    protected OS os;

    static  class  USB{
        private String type;
        public USB(String type){
            this.type = type;
        }
        public void displayInfo(){
            System.out.println("USB Type: " + type);
        }
    }

    public Computer(String brand, String model, String osName) {
        this.brand = brand;
        this.model = model;
        this.os =new  OS(osName);
    }

     class OS {
        private String osName;

        public OS(String osName) {
            this.osName = osName;
        }

        public void displayOSInfo() {
            System.out.print("Brand: " + brand);
            System.out.print("  Model: " + model);
            System.out.println("  OS Name: " + osName);
        }
    }

}


public class IC3 {
    public static void main(String[] args) {
        Computer computer = new Computer("Dell", "XPS", "Windows 10");
        computer.os.displayOSInfo();
        Computer.USB usb=new Computer.USB("C");
        usb.displayInfo();
    }
}

