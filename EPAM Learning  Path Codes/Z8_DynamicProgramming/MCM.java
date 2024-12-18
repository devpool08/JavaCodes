package Z8_DynamicProgramming;
//Difficulty Level Hard
import java.util.Arrays;
//::::::::::::::::::::::::::::::Matrix Chain Multiplication:::::::::::::::::::::::::::::::::::::::
public class MCM {
	public static int arr[] = { 1, 2, 3, 4, 3 };
	public static int dp[][]= new int[arr.length][arr.length];
	public static int mcmrec(int i, int j) {
		//::::::::::::::::::::::::::::By Recursion::::::::::::::::::::::::::::::::::::::::::::::::
		//time complexity o(n^2logn)
		if (i == j) {
			return 0;
		}
		int ans = Integer.MAX_VALUE;
		for (int k = i; k <j -1 ; k++) {
			int cost1 = mcmrec(i, k);
			int cost2 = mcmrec(k + 1, j);
			int cost3 = arr[i - 1] * arr[k] * arr[j];
			int actcost = cost1 + cost2 + cost3;
			ans = Math.min(ans, actcost);
		}
		return ans;
	}
	public static int mcmmemo(int i,int j) {
		//::::::::::::::::::::::::::By Memorization:::::::::::::::::::::::::::::::::::::::::::::::
		//time complexity O(n^2)
		if(i==j) {
			return 0;
		}
		else if(dp[i][j]!=-1) {
			return dp[i][j];
		}
		else {
			int ans=Integer.MAX_VALUE;
			for(int k=i;k<j;k++) {
					int cost1 = mcmrec(i, k);
					int cost2 = mcmrec(k + 1, j);
					int cost3 = arr[i - 1] * arr[k] * arr[j];
					int actcost = cost1 + cost2 + cost3;
					ans = Math.min(ans, actcost);
			}
			return dp[i][j]=ans;
		}
		
	}

	public static void main(String[] args) {
		System.out.println("By Recursion : "+mcmrec(1, 4)+" :(");
		int n=arr.length;
		//creation and initialization of array(for memorization):
		for(int i=0;i<arr.length;i++) {
			Arrays.fill(dp[i],-1);
		}
		System.out.println("By Memoization : "+mcmmemo(1,4)+" :)");
	}

}
