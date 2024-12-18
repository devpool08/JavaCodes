package Z3_Queue;

import java.util.Scanner;

public class Queue_Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array.");
		int sz = sc.nextInt();
		Queue_Operations q1 = new Queue_Operations(sz);
		while (true) {
			System.out.println("0. Exit");
			System.out.println("1. Enqueue");
			System.out.println("2. Dequeue");
			System.out.println("3. Front element");
			System.out.println("4. Display");
			System.out.print("Choose your option: ");
			int choice = sc.nextInt();

			switch (choice) {
			case 0:
				return;
			case 1:
				System.out.print("Enter the element: ");
				int x = sc.nextInt();
				q1.enqueue(x);
				break;
			case 2:
				q1.dequeue();
				break;
			case 3:
				System.out.println("Top element: " + q1.peek());
				break;
			case 4:
				q1.display();
				break;
			default:
				System.out.println("Invalid option");
				break;
			}

		}

	}
}