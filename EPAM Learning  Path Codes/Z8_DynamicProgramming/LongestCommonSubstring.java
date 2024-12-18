package Z8_DynamicProgramming;

public class LongestCommonSubstring {
	public static String str3 ="ABCDE";
	public static String str4="ABGCE";
	public static void LCS() {
		int n=str3.length();
		int m=str4.length();
		int ans=0;
		int dp[][]=new int [n+1][m+1];
		for(int i=0;i<n+1;i++) {
			dp[i][0]=0;
		}
		for(int j=0;j<m+1;j++) {
			dp[0][j]=0;
		}
		for(int i=1;i<n+1;i++) {
			for(int j=1;j<m+1;j++) {
				if(str3.charAt(i-1)==str4.charAt(j-1)) {
					dp[i][j]=dp[i-1][j-1]+1;
					ans=Math.max(ans, dp[i][j]);
				}
				else {
					dp[i][j]=0;
				}
			}
		}
		System.out.println(ans);
	}

	public static void main(String[] args) {
		LCS();

	}

}
