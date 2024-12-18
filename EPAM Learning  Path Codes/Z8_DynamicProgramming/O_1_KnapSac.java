package Z8_DynamicProgramming;

public class O_1_KnapSac {
	public static int val[] = { 15, 14, 10, 45, 30 };
	public static int wt[] = { 2, 5, 1, 3, 4 };
	public static int cap = 7;
	public static int w =8; 
	public static int KnpSac( int w, int n) {
		if (w == 0 || n == 0) {
			return 0;
		}
		if (wt[n - 1] <= w) {
			// include.
			int ans1 = val[n - 1] + KnpSac(w - wt[n - 1], n - 1);
			// exclude.
			int ans2 = KnpSac( w - wt[n - 1], n - 1);
			return Math.max(ans1, ans2);
		} else {
			return  KnpSac( w, n - 1);
		}
//code manual
////		int dp1[][]=new int[n+1][w+1];
////		for(int j=0;j<w+1;j++) {
////			dp1[0][j]=0;
////		}
////		for(int i=0;i<n+1;i++) {
////			dp1[i][0]=0;
////		}
////		for(int i=1;i<n+1;i++) {
////			for(int j=1;j<w+1;j++) {
////				if(wt[i-1]<j) {
////					dp1[i][j]=Math.max(val[i-1]+dp1[i][j-wt[i-1]], dp1[i-1][j]);
////				}
////				else
////					dp1[i][j]=dp1[i-1][j];
////			}
////		}
////		System.out.println("The total array is:");
////		for(int i=0;i<n+1;i++) {
////			for(int j=0;j<w+1;j++) {
////				System.out.print(dp1[i][j]+",");
////			}
////			System.out.println();
////		}
////		
////		
////	return dp1[n][w];	
//	
 	}
	public static int  UnBouKnpSac(int w,int n) {
		int dp1[][]=new int[n+1][w+1];
		for(int j=0;j<w+1;j++) {
			dp1[0][j]=0;
		}
		for(int i=0;i<n+1;i++) {
			dp1[i][0]=0;
		}
		for(int i=1;i<n+1;i++) {
			for(int j=1;j<w+1;j++) {
				if(wt[i-1]<j) {
					dp1[i][j]=Math.max(val[i]+dp1[i][j-wt[i-1]], dp1[i-1][j]);
				}
				else
					dp1[i][j]=dp1[i-1][j];
			}
		}
		System.out.println("The total array is:");
		for(int i=0;i<n+1;i++) {
			for(int j=0;j<w+1;j++) {
				System.out.print(dp1[i][j]+",");
			}
			System.out.println();
		}
		
		
	return dp1[n][w];	
	}

	public static void main(String[] args) {

		System.out.println("ANS OF Zero-One Knap Sac: " + KnpSac( cap, val.length));
		System.out.println("ANS OF Unbounded Knap Sac:" + UnBouKnpSac(w, val.length));

	}

}
