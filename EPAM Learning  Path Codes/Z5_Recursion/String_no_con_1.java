package Z5_Recursion;//no consecutive one placed together.

public class String_no_con_1 {
	public static void pri(int n,int last,String str) {
		if (n==0) {
			System.out.println(str);
			return ;
		}
		if (last==0) {
			pri(n-1,0,str+0);
			pri(n-1,1,str+1);
		}
		else 
			pri(n-1,0,str+0);
		
	}

	public static void main(String[] args) {
		pri(5,0,"");
	

	}

}
