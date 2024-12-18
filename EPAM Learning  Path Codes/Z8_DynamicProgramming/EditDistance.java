package Z8_DynamicProgramming;

public class EditDistance {
	public static String str4="intention";
	public static String str5="execution";
	public static void ED(){
		int n= str4.length();
		int m= str5.length();
		int dp[][]=new int [n+1][m+1];
		for(int i=0;i<n+1;i++) {
			for(int j=0;j<m+1;j++) {
				if(i==0) {
					dp[i][j]=j;
				}
				if(j==0) {
					dp[i][j]=i;
				}
			}			
		}
		for(int i=1;i<n+1;i++) {
			for(int j=1;j<m+1;j++) {
				if(str4.charAt(i-1)==str5.charAt(j-1)) {
					dp[i][j]=dp[i-1][j-1];
				}
				else {
					int add=dp[i][j-1]+1;
					int del=dp[i-1][j]+1;
					int rep=dp[i-1][j-1]+1;
					dp[i][j]=Math.min(add,Math.min(del, rep));
				}
			}
		}
		System.out.println(dp[n][m]);
	}
	public static void main(String[] args) {
		ED();
		
	}

}
