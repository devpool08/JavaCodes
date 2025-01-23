package B_ConditionalStatement;
@SuppressWarnings("ALL")
public class Loops {
    public static void main(String[] arg) {
        {
            int i = 0;
            System.out.println("for break syntax");
            while (true) {
                if (i > 4) {
                    break;
                }
                System.out.print(i+++" ");
            }
            System.out.println();
        }
        {

            System.out.println("for continue");
            for (int j = 0; j < 5; j++) {
                if (j == 2) {
                    continue;
                }
                System.out.print(j+" ");
            }
            System.out.println();
            System.out.println("break outer");
        }
        {

            int i = 0;
            outer_i: while ( i < 5) {
                int j = 0;
                while (j < 2) {
                    j++;
                    System.out.println("i=" + i + ", j=" + j);
                    break outer_i;
                }
            }
        }
        System.out.println("continue outer");
        {
            int i = 0;
            outer: while (i++ < 4) {
                int j = 0;
               inner_j: while (j++ < 6) {
                    if (j == 2) {
                        continue ;
                    }
                    if(j==3){
                        continue outer;
                    }
                    System.out.println("i = " + i + "; j = " + j);
                }
            }
        }
    }
}
