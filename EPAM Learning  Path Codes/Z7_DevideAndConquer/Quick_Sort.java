package Z7_DevideAndConquer;

import java.util.Scanner;

public class Quick_Sort {
	public static void print(int array[]) {
		System.out.print("{");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ",");
		}
		System.out.println("}");
	}

	public static void sort(int arr[], int si, int ei) {
		// base case:
		if (si >= ei) {
			return;
		}
		int pid = partation(arr, si, ei);
		sort(arr, si, pid - 1);
		sort(arr, pid + 1, ei);

	}

	public static int partation(int arr[], int si, int ei) {
		int pivot = arr[ei];
		int i = si - 1;// firstly the index initilized with -1;
		for (int j = si; j < ei; j++) {
			if (arr[j] <= pivot) {
				i++;
				// swap;
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
		}
		i++;
		// place the pivot in correct place.
		int temp = pivot;
		arr[ei] = arr[i];
		arr[i] = temp;
		return i;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the array:");
		int size = sc.nextInt();
		int array[] = new int[size ];
		for (int i = 0; i < size ; i++) {
			System.out.println("enter " + (i + 1) + " number element.");
			array[i] = sc.nextInt();
		}
		System.out.println("your Unsorted Array is :");
		print(array);
		sort(array, 0, array.length - 1);
		System.out.println("your sorted Array is :");
		print(array);
	}

}
