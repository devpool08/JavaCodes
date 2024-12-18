package Z8_DynamicProgramming;
//difficulty level HARD
public class WildCaradMatching {
	public static String s="baaabab";//str
	public static String p="*****ba******ab";//ptr
	public static void isMatch() {
		int n=s.length();
		int m=p.length();
		boolean dp[][]= new boolean[n+1][m+1];
		//initialization
		dp[0][0]=true;
		for(int i=1;i<n+1;i++) {
			dp[i][0]=false;
		}
		for(int i=1;i<m+1;i++) {
			if(p.charAt(i-1)=='*') {
				dp[0][i]=dp[0][i-1];
			}
		}
		//Bottom up filling;
		for(int i=1;i<n+1;i++) {
			for(int j=1;j<m+1;j++) {
				//CASE I
				if(s.charAt(i-1)==p.charAt(j-1)||p.charAt(j-1)=='?') {
					dp[i][j]=dp[i-1][j-1];
				}
				else if(p.charAt(j-1)=='*') {
					dp[i][j]=dp[i-1][j]||dp[i][j-1];
				}
				else {
					dp[i][j]=false;
				}
			}
		}
		for(int i=0;i<n+1;i++) {
			for(int j=0;j<m+1;j++) {
				System.out.print(dp[i][j]+",");
			}
			System.out.println();
		}
		System.out.println(dp[n][m]);
	}

	public static void main(String[] args) {
isMatch();
	}

}
