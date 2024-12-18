package Z5_Recursion;

class pnt{
	public static int prc(int n) {
		if (n<=0) {
			System.out.println(n);
			return 0; 
		}
		else
			 System.out.println(n);
			return prc(n-1);
	}
	
}
public class Print {
	public static void main(String[] args) {
		pnt p=new pnt();
		p.prc(10);
		
	}

}
