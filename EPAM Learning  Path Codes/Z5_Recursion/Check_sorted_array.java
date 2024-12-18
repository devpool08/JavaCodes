package Z5_Recursion;

class check{
	public static boolean IsSorted(int arr[],int i) {
		if(i==arr.length-1) {
			return true;
		}
	else if(arr[i]>arr[i+1]) {
			return false;
		}
		return IsSorted(arr,i+1);
	}
	
}

public class Check_sorted_array {
	public static void main(String[] args) {
		int arr[]= {1,2,4,9,8,78,79};
		check c= new check();
		System.out.println(c.IsSorted(arr,0));;
		
		
		
		
	}

}
