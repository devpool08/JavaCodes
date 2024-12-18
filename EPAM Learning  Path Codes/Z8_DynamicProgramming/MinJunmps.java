package Z8_DynamicProgramming;

public class MinJunmps {
	public static int arr[]= {2,3,1,1,4};
	public static void 	minJmp() {
		int n=arr.length;
		int dp[]=new int[n+1];
		for(int i=0;i<arr.length;i++) {
			dp[i]=-1;
			}
		dp[n-1]=0;
		for(int i=n-2;i>=0;i--) {
			int stp=arr[i];
			int ans=Integer.MAX_VALUE;
			for(int j=i+1;j<=i+stp&&j<n;j++) {
				if(dp[j]!=-1) {
					ans=Math.min(ans, dp[j]+1);
				}
			}
			if(ans!= Integer.MAX_VALUE) {
				dp[i]=ans;
			}
		}
		System.out.println("ans is : "+dp[0]);

	}
	public static void main(String[] args) {		
		minJmp();
	}

}
