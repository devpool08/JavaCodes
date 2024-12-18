package Z5_Recursion;

class pow{
	//time complexity n log n.
	static int power(int x,int n) {
		if(n<=0) {
			return 1;
		}
		else return x*power(x,n-1);
	}
	
}
public class X_To_Pow_N {

	public static void main(String[] args) {
		int x=23;
		int n=5;
		pow p=new pow();
		int c=p.power(x,n);
		System.out.println(c);
	

	}

}
