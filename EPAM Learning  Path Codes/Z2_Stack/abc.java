package Z2_Stack;

import java.util.*;

class Node {
	int info;
	Node link;
}

public class abc {
	static Node start = null;

	static void create() {
		Node p = new Node();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the info");
		p.info = in.nextInt();
		p.link = null;
		Node q = p;
		char ch = 'y';
		while (ch != 'n') {
			if (start == null) {
				start = p;
			} else {
				p = new Node();
				System.out.println("Enter info");
				p.info = in.nextInt();
				p.link = null;
				q.link = p;
				q = p;
			}
			System.out.println("Do you want to continue Y/N ");
			ch = in.next().charAt(0);
		}
	}

	static void display() {
		if (start == null) {
			System.out.println("LinkedList is empty");
		} else {
			System.out.println("Start : " + start);
			Node p = start;
			while (p != null) {
				System.out.println(p.info + "  " + p.link);
				p = p.link;
			}
		}
	}

	// extra method for our benefits
	static int count(Node node) {
		int count = 0;
		while (node != null) {
			count++;
			node = node.link;
		}
		return count;
	}

	static int find2ndMax() {
		int first, second;
		Node head = start;
		int list_size = count(head);
		if (list_size < 2) {
			System.out.print("Invalid Input");
			return 0;
		}
		first = second = Integer.MIN_VALUE;
		Node temp = head;
		while (temp != null) {
			if (temp.info > first) {
				second = first;
				first = temp.info;
			} else if (temp.info > second && temp.info != first)
				second = temp.info;
			temp = temp.link;
		}

		if (second == Integer.MIN_VALUE)
			System.out.print("There is no second largest element\n");
		else
			System.out.println("The second largest element is " + second);
		return list_size;
	}

	static void search(int ele) {
		if (start == null) {
			System.out.println("LL is empty");
		} else {
			int pos = 1, flag = 0;
			Node q = start;
			while (q != null) {
				if (q.info == ele) {
					System.out.println("Element found in position = " + pos);
					flag++;
				}
				pos++;
				q = q.link;
			}
			if (flag == 0) {
				System.out.println("Search is unsuccessful");
			} else {
				System.out.println("Element is found " + flag + " times");
			}
		}
	}

	// extra method for our benefits
	static void sort() {
		for (Node i = start; i != null; i = i.link) {
			for (Node j = i.link; j != null; j = j.link) {
				if (i.info > j.info) {
					int t = i.info;
					i.info = j.info;
					j.info = t;
				}
			}
		}
		display();
	}

	static void removeDuplicate() {
		Node p = start;
		while (p != null) {
			Node q = p;
			while (q != null && q.info == p.info) {
				q = q.link;
			}
			p.link = q;
			p = p.link;
		}
		display();
	}

	static int countUnique() {
		int c = 0;
		Node p = start;
		while (p != null) {
			Node q = p;
			while (q != null && q.info == p.info) {
				q = q.link;
			}
			p.link = q;
			p = p.link;
			c++;
		}
		return c;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("    ****MENU****    ");
			System.out.println("0: Exit");
			System.out.println("1: Create the LinkedList");
			System.out.println("2: Display the LinkedList");
			System.out.println("3: Print the second largest element");
			System.out.println("4: Search for an element in the LinkedList");
			System.out.println("5: Sort your LinkedList");
			System.out.println("6: Remove duplicate element");
			System.out.println("7: Count the number of unique elements");
			System.out.println("Enter your choice");
			int choice = sc.nextInt();

			switch (choice) {
			case 0:
				System.exit(0);
			case 1:
				create();
				break;
			case 2:
				display();
				break;
			case 3:
				find2ndMax();
				break;
			case 4:
				System.out.println("Enter element you want to search ");
				search(sc.nextInt());
				break;
			case 5:
				sort();
				break;
			case 6:
				removeDuplicate();
				break;
			case 7:
				System.out.println("The number of unique elements are = " + countUnique());
				break;
			default:
				System.out.println("Wrong choice");
			}
		}
	}
}

////OUTPUT:
////
////    ****MENU****    
//0: Exit
//1: Create the LinkedList
//2: Display the LinkedList
//3: Print the second largest element
//4: Search for an element in the LinkedList
//5: Sort your LinkedList
//6: Remove duplicate element
//7: Count the number of unique elements
//Enter your choice
//1
//Enter the info
//2
//Do you want to continue Y/N 
//y
//Enter info
//3
//Do you want to continue Y/N 
//y
//Enter info
//5
//Do you want to continue Y/N 
//y
//Enter info
//8
//Do you want to continue Y/N 
//y
//Enter info
//2
//Do you want to continue Y/N 
//n
//    ****MENU****    
//0: Exit
//1: Create the LinkedList
//2: Display the LinkedList
//3: Print the second largest element
//4: Search for an element in the LinkedList
//5: Sort your LinkedList
//6: Remove duplicate element
//7: Count the number of unique elements
//Enter your choice
//2
//Start : Node@7f63425a
//2  Node@36d64342
//3  Node@39ba5a14
//5  Node@511baa65
//8  Node@340f438e
//2  null
//    ****MENU****    
//0: Exit
//1: Create the LinkedList
//2: Display the LinkedList
//3: Print the second largest element
//4: Search for an element in the LinkedList
//5: Sort your LinkedList
//6: Remove duplicate element
//7: Count the number of unique elements
//Enter your choice
//3
//The second largest element is 5
//    ****MENU****    
//0: Exit
//1: Create the LinkedList
//2: Display the LinkedList
//3: Print the second largest element
//4: Search for an element in the LinkedList
//5: Sort your LinkedList
//6: Remove duplicate element
//7: Count the number of unique elements
//Enter your choice
//4
//Enter element you want to search 
//8
//Element found in position = 4
//Element is found 1 times
//    ****MENU****    
//0: Exit
//1: Create the LinkedList
//2: Display the LinkedList
//3: Print the second largest element
//4: Search for an element in the LinkedList
//5: Sort your LinkedList
//6: Remove duplicate element
//7: Count the number of unique elements
//Enter your choice
//5
//Start : Node@7f63425a
//2  Node@36d64342
//2  Node@39ba5a14
//3  Node@511baa65
//5  Node@340f438e
//8  null
//    ****MENU****    
//0: Exit
//1: Create the LinkedList
//2: Display the LinkedList
//3: Print the second largest element
//4: Search for an element in the LinkedList
//5: Sort your LinkedList
//6: Remove duplicate element
//7: Count the number of unique elements
//Enter your choice
//6
//Start : Node@7f63425a
//2  Node@39ba5a14
//3  Node@511baa65
//5  Node@340f438e
//8  null
//    ****MENU****    
//0: Exit
//1: Create the LinkedList
//2: Display the LinkedList
//3: Print the second largest element
//4: Search for an element in the LinkedList
//5: Sort your LinkedList
//6: Remove duplicate element
//7: Count the number of unique elements
//Enter your choice
//7
//The number of unique elements are = 4
//    ****MENU****    
//0: Exit
//1: Create the LinkedList
//2: Display the LinkedList
//3: Print the second largest element
//4: Search for an element in the LinkedList
//5: Sort your LinkedList
//6: Remove duplicate element
//7: Count the number of unique elements
//Enter your choice
//0