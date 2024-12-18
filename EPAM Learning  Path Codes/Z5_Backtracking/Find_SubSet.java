package Z5_Backtracking;

import java.util.Scanner;

//find all possible set of "abc" ie a,b,c,ab,bc,ca,abc,and fi.
//a set has 2 ^ n sub set.
public class Find_SubSet {
	public static void find(String str, String ans, int i) {
		// base case:
		if (i == str.length()) {
			System.out.println(ans);
			return;
		}
		// function:statics
		// if yes choice:fanstasticsd
		find(str, ans + str.charAt(i), i + 1);
		// if no is choice:
		find(str, ans, i + 1);
	}

	public static void main(String[] args) {
		String str = "chinu";
		Scanner sc= new Scanner(System.in);
		find(str, "", 0);
	}
                                                 
}
           