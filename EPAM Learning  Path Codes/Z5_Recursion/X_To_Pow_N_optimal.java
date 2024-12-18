package Z5_Recursion;

class optimal{//doubt
	
public static int op_power(int a1,int x1) {
		if (x1==1) {
			return 1;
		}
		int hp=op_power(a1,x1/2)*op_power(a1,x1/2);

		return hp;
	}
}
public class X_To_Pow_N_optimal {

	public static void main(String[] args) {
int a1=2;
int b=4;
optimal op=new optimal();
int c1=op.op_power(a1, b);
System.out.println(c1);

	}

}
