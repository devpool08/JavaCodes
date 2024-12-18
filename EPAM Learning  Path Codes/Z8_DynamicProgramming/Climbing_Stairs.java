package Z8_DynamicProgramming;
//1 extra jump add 1 extra call for example suppose if 3 jump allowed way(n-1)+way(n-2)+way(n-3); 
public class Climbing_Stairs {
	public static int way(int n) {
		if(n==0) {
			return 1;
		}
		if(n<0) {
			return 0;
		}
//		int no=way(n-1)+way(n-2); 
//		System.out.print(no);
			return way(n-1)+way(n-2);
	
	}

	public static void main(String[] args) {
		System.out.println(way(5));

	}

}
