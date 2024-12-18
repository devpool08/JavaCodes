package Z5_Recursion;

class tile{
	public static int siz(int n) {//here n represent size of 2Xn
		if(n==0 || n==1) {
			return 1;
		}
		int ver=siz(n-1);
		
		int hor=siz(n-2);
		
		int tot=ver+hor;
		return tot;
	}
}
public class tiling {

	public static void main(String[] args) {
		int n=4;
		tile t= new tile();
		System.out.println(t.siz(n));
	

	}

}
