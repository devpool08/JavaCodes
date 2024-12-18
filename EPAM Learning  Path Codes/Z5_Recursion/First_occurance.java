package Z5_Recursion;

class check1{
	static int chk(int arr[],int key,int i) {
		if (i==arr.length) {
			return -1;
		}

		else if (i==key) {
			return chk(arr,key,i+1);
		}
		else if(arr[i]==arr[key]) {
			return i;
		}
		else {
			return chk(arr,key,i+1);
		}
	}
}
public class First_occurance {

	public static void main(String[] args) {
	int arr[]= {1,2,3,5,5,5,7,7,1,3,4,2,5,5,6,7,1};
	check1 c= new check1();
	System.out.println(c.chk(arr,1,0));

	}

}
