package C_Class;

import java.util.Arrays;



@SuppressWarnings("ALL")
public class b_Initialization {
    private static final char[] alpha;
    static {
        System.out.println("this printed first");
        alpha = new char[26];
        int i = 0;
        for (char c = 'a'; i < alpha.length; c++, i++) {
            alpha[i] = c;
        }
    }
    {
        System.out.println("never printed ");
        for (char c : alpha) {
            System.out.print(c + " ");
        }
    }
    public static void main(String[] arg) {
        System.out.println("main");
        System.out.print(Arrays.toString(alpha));
    }
}