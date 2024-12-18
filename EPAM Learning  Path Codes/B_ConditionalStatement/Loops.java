package B_ConditionalStatement;

public class Loops {
    public static void main(String[] arg) {
        {
            int i = 0;
            System.out.println("for break syntax");
            while (true) {
                if (i > 4) {
                    break;
                }
                System.out.println(i++);
            }
        }
        {

            System.out.println("for continue");
            for (int j = 0; j < 5; j++) {
                if (j == 2) {
                    continue;
                }
                System.out.println(j);
            }

            System.out.println("break outer");
        }
        {

            int i = 0;
            outeri: while ( i < 5) {
                int j = 0;
                while (j < 2) {
                    j++;
                    System.out.println("i=" + i + ", j=" + j);
                    break outeri;
                }
            }
        }
        System.out.println("continue outer");
        {
            int i = 0;
            outer: while (i++ < 3) {
                int j = 0;
                while (j++ < 5) {
                    if (j == 2) {
                        continue outer;
                    }
                    System.out.println("i = " + i + "; j = " + j);
                }
            }
        }
    }
}
