package D_OOPS;

class Insurance {
    public static final int LOW = 100;
    public int getPremium() {
        return LOW;
    }
    public static String getCategory() {
        return "Insurance";
    }
}
class CarInsurance extends Insurance {
    public static final int HIGH = 200;
    @Override
    public int getPremium() {
        return HIGH;
    }
    public static String getCategory() {
        return "CarInsurance";
    }
}
public class f_Polymorphisms {
    public static void main(String[] args) {

        /*Statically—during compilation early binding*/

        Insurance current = new CarInsurance();
        System.out.println("category: " + current.getCategory() );//category: Insurance
        System.out.println("category: " + CarInsurance.getCategory() );//category: CarInsurance
        System.out.println();
        CarInsurance current2 = new CarInsurance();
        System.out.println("category: " + current2.getCategory() );//Category: CarInsurance
        System.out.println("category: " + CarInsurance.getCategory() );//category: CarInsurance
        System.out.println();
        System.out.println("category: " + current.getPremium());//category: Insurance



    }
}