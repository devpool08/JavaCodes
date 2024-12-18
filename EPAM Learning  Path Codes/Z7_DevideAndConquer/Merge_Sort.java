package Z7_DevideAndConquer;

import java.util.Scanner;

public class Merge_Sort {
	public static void divide(int array[], int si, int ei) {
		// si=starting index.
		// ei=Ending index.
		if (si >= ei) {
			return;
		}
		int mid = si + (ei - si) / 2;
		// left side:
		divide(array, si, mid);
		// Right side:
		divide(array, mid + 1, ei);
		// Conquer/merge part
		merge(array, si, mid, ei);
	}

	public static void merge(int array[], int si, int mid, int ei) {

		// Building a temporary array:
		int temp[] = new int[ei - si + 1];
		// for left part first element:
		int i = si;
		// for right part first element:
		int j = mid + 1;
		// for storing in array we need a iterator:
		int k = 0;
		// loop termination condition.
		while (i <= mid && j <= ei) {
			if (array[i] < array[j]) {
				temp[k] = array[i];
				i++;

			} else {
				temp[k] = array[j];
				j++;

			}
			k++;
		}
			while (i <= mid) {
				temp[k++] = array[i++];
			}
			while (j <= ei) {
				temp[k++] = array[j++];
			}

			for (k = 0, i = si; k < temp.length; k++, i++) {
				array[i] = temp[k];
			}
		
	}

	public static void print(int array[]) {
		System.out.print("{");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ",");
		}
		System.out.println("}");
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size of the array:");
		int size=sc.nextInt();
		int array[]=new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("enter "+(i+1)+" number element.");
			array[i]=sc.nextInt();
		}
		System.out.println("your Unsorted Array is :");
		print(array);
		divide(array, 0, array.length - 1);
		System.out.println("your sorted Array is :");
		print(array);
	}

}
