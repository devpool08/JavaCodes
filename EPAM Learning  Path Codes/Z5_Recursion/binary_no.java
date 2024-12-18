package Z5_Recursion;

import java.util.Scanner;

public class binary_no {
	public static void bin(int n,String str) {
		if(n==0) {
			System.out.println(str);
			return;
		}
		bin(n-1,str+0);
		bin(n-1,str+1);
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number u wanna print");
		int n= sc.nextInt();
		int c =-1;
		while (n != 0) {
			n=n/2;
			c++;
		}
	    bin(c,"");

	}
}
