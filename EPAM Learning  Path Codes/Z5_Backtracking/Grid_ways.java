package Z5_Backtracking;

import java.util.Scanner;

//the  total no of ways from (0,0) to (n-1,m-1)
//Where n=row m=col && no left side tracking and diagonally
public class Grid_ways {

	public static int way(int i,int j,int n,int m) {
		if(i==n-1 && j==m-1) {
			return 1;
		}
		if(i==n || j==m) {
			return 0;
		}
		int w1=way(i,j+1,n,m);
		int w2=way(i+1,j,n,m);
		return w1+w2;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter row numbre :");
		int n=sc.nextInt();
		System.out.println("enter col number :");
		int m= sc.nextInt();
		System.out.println("your total no of ways is: "+way(0,0,n,m));
		

	}

}
