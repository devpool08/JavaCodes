package Z4_Heap;

public class HeapSort {
	static int arr[]= {1,4,2,8,9,7,5,3,12,10};
	public static void Heapify(int i,int n) {
		int l=2*i+1;
		int r=2*i+2;
		int max=i;
		if(l<n && arr[max]<arr[l]) {
			max=l;
		}
		if(r<n && arr[max]<arr[r]) {
			max=r;
		}
		if(max!=i) {
			int temp=arr[i];
			arr[i]=arr[max];
			arr[max]=temp;
			 Heapify(max,n);
		}
	}
	public static void HpSort() {
		int n=arr.length;
		for(int i=n/2;i>=0;i--) {
			Heapify(i,n);
		}
		for(int i=n-1;i>0;i--) {
			int temp=arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
			Heapify(0,i);
		}
		
	}

	public static void main(String[] args) {
		HpSort();
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
