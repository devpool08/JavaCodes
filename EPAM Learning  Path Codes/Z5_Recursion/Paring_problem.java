package Z5_Recursion;

class paring{
	public static int pr(int n) {
		if (n==1||n==2) {
			return n;
		}
		//single
		int sig=pr(n-1);
		//pair
		int way=(n-1)*pr(n-2);
		int tot=sig+way;
		return tot;
	}
}
public class Paring_problem {

	public static void main(String[] args) {
		paring p= new paring();
		System.out.println(p.pr(3));

	}

}
