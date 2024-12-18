package Z8_DynamicProgramming;

//LONGEST COMMON SUBSEQUENCES:
public class LCS {
	public static String str1 = "abcdge";
	public static String str2 = "abedg";

	public static int LCS(int n, int m) {
		if (n == 0 || m == 0) {
			return 0;
		}
		if (str1.charAt(n - 1) == str2.charAt(m - 1)) {
			return 1 + LCS(n - 1, m - 1);
		} else {
			int ans1 = LCS(n - 1, m);
			int ans2 = LCS(n, m - 1);
			int ans = Math.max(ans1, ans2);
			return ans;

		}
	}

	public static void main(String[] args) {
		System.out.println(LCS(str1.length(), str2.length()));
	}

}
