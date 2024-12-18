package Z8_DynamicProgramming;
//Difficulty level medium:
//variation of 0-1 Knap_Sac
public class Min_Partition {
	public static int arr[]= {1,6,11,5};
	public static int minPart() {
		int n= arr.length;
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		int w=sum/2;
		int dp[][]= new int[n+1][w+1];
		for(int i=1;i<n+1;i++) {
			for(int j=1;j<w+1;j++) {
				if(arr[i-1]<=j) {
					//include:
					dp[i][j]=Math.max(arr[i-1]+dp[i-1][j-arr[i-1]],dp[i-1][j]);
				}
				else {
					dp[i][j]=dp[i-1][j];
				}
			}
		}
		int sum1=dp[n][w];
		int sum2=sum-sum1;
		return Math.abs(sum1-sum2);
	}

	public static void main(String[] args) {
		System.out.println(minPart());

	}

}
