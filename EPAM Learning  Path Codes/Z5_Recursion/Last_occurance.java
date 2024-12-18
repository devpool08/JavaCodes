package Z5_Recursion;

class check2{
	static int chk2(int arr2[],int key2,int i2) {
		if (i2<=0) {
			return -1;
		}
		else if(arr2[i2]==arr2[key2]) {
			return i2;
		}
		else {
			return chk2(arr2,key2,i2-1);
		}
	}
}
public class Last_occurance {
	public static void main(String[] args) {
		int arr2[]= {1,2,3,5,5,5,7,7,1,3,4,2,5,5,6,7,1};
		check2 c2= new check2();
		System.out.println(c2.chk2(arr2,6,arr2.length));
	}
}
