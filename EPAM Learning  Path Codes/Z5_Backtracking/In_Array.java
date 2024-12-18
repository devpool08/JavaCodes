package Z5_Backtracking;

public class In_Array {
	public static void ChangeArr(int arr[],int i,int val) {
		//base case:
		if(i==arr.length) {
			print(arr);
			return; 
		}		
		//Function:
		arr[i]=val;
		ChangeArr(arr,i+1,val+1);
		//BackTracking:
		arr[i]=arr[i]-2;
	}
	public static void print(int array[]) {
		System.out.print("{");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ",");
		}
		System.out.println("}");
	}

	public static void main(String[] args) {
		int arr[]=new int[5];
		ChangeArr(arr,0,1);
		print(arr);

	}

}
