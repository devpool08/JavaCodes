package Z8_DynamicProgramming;

import java.util.Scanner;
//VARIATION - Counting BST and Mountain Ranges
public class CtalanNumber {
	public static int cat(int n) {
		if(n==0||n==1) {
			return 1;
		}
		int ans=0;
		for(int i=0;i<=n-1;i++) {
			 ans+=cat(i)*cat(n-i-1);
		}
		return ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the catalan numbre:");
		int n= sc.nextInt();
		System.out.println("Here is the value by Recursion: "+cat(n));
		int dp[]=new int[n+1];
		dp[0]=1;
		dp[1]=1;
		for(int i=2;i<=n;i++) {
			for(int j=0;j<i;j++) {
				dp[i]+=dp[j]*dp[i-j-1];
			}
		}
		System.out.println("Here is the value by Tabulation: "+dp[n]);
	}

}
