package H_Lamda_And_Streams;
interface devotee {
    int grtRound();
    String getSeva();
}
@FunctionalInterface
interface Chant{
    int grtRound();
}
class devo implements devotee {

    @Override
    public int grtRound() {
        return 64;
    }

    @Override
    public String getSeva() {
        return "Shringar seva";
    }
}
public class Lam2 {
    int rounds =92;
    public static void main(String[] args) {
        devo d=new devo();
        System.out.println(d.grtRound()+" Rounds for "+d.getSeva());

        //Anonymous class
        devotee d2=new devotee() {
            @Override
            public int grtRound() {
                return 16;
            }

            @Override
            public String getSeva() {
                return "Book Distribution";
            }
        };
        System.out.println(d2.grtRound()+" Rounds for "+d2.getSeva());

        doChanting();
    }
    private static void doChanting(){
        Chant chant=()-> 16;
        chant.grtRound();
        //final int[] r0 = {108};for solving error of line no 48
        int r0=108;
        final int r1=108;

        Chant chant1=()->{
//            r0=108;//show error bcz Variable used in lambda expression should be final or effectively final
//            return r0;//error
              String s0= "Hare Krishna";
              //System.out.println(this.s);show error because s is not instance variable
              System.out.println(s0);
              return  r1; //correct
        };
        System.out.println("in doChant method chanting "+chant1.grtRound()+" Rounds (by functional interface)");

        //By Anonymous inner class
        Chant chant2=new Chant() {
            String s= "Hare Krishna";
            @Override
            public int grtRound() {
                System.out.println(this.s);
                //System.out.println(s); this is also correct
                return 192;
                //System.out.println("Illusion"); this is an error because unreachable statement

            }
        };
        System.out.println("in doChant method chanting "+chant2.grtRound()+" Rounds (by anonymous inner class)");
    }
}
