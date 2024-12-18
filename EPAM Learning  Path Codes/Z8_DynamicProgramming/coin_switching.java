package Z8_DynamicProgramming;

public class coin_switching {
	static int nCoin(int n ,int arr[]) {
		if (n==0) {
			return 0;
		}
		int ans = Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(n-arr[i]>=0) {
				int sub_ans=nCoin(n-arr[i],arr);
				if(ans>sub_ans+1&&sub_ans!=ans) {
					ans=sub_ans+1;
				}
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		int arr[]= {5,7,1};
		int n=18;
		System.out.println(nCoin(n,arr));

	}

}