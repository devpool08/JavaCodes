package C_Class;

import java.util.Arrays;
public class b_Initialization {
    private static char[] alph;
    static {
        System.out.println("this printed first");
        alph = new char[26];
        int i = 0;
        for (char c = 'a'; i < alph.length; c++, i++) {
            alph[i] = c;
        }
    }
    {
        System.out.println("never printed ");
        for (char c : alph) {
            System.out.print(c + " ");
        }
    }
    public static void main(String[] arg) {
        System.out.println("main");
        System.out.print(Arrays.toString(alph));
    }
}