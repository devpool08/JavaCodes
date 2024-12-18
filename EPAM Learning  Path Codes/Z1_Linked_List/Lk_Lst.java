package Z1_Linked_List;

import java.util.Scanner;

public class Lk_Lst {
	public static Scanner sc = new Scanner(System.in);

	public static class node {
		int data;
		node next;

		public node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static node head;
	public static node tail;
	public static int size = 0;

	public static void addBeg(int data) {// time complexity==O(1);bcz we are not perform any kind of loop or recursion;
		size++;
		node n = new node(data);
		if (head == null) {
			head = tail = n;
			return;
		}
		n.next = head;
		head = n;
	}

	public static void addEnd(int data) {// time complexity==O(1);
		size++;
		node n = new node(data);
		n.next = null;
		if (head == null) {
			head = tail = n;
		}
		tail.next = n;
		tail = n;

	}

	public static void print() {// time complexity ==O(n);
		node temp = head;

		while (temp != null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
		System.out.println("null");

	}

	public static void insAt(int id, int data) {// time complexity is O(n);

		if (id == 0) {
			addBeg(data);
			return;
		}
		int count = 1;
		node temp = head;
		size++;
		node n = new node(data);
		while (count < id - 1) {
			temp = temp.next;
			count++;
		}
		n.next = temp.next;
		temp.next = n;
	}

	public static int size() {// time complexity is O(1);
		return size;
	}

	public static void delBeg() {
		if (size == 0) {
			System.out.println("under flow");
		} 
		else if (size == 1) {
			head = tail = null;
			size = 0;
		}
		else {
			int val = head.data;
			head = head.next;
			size--;
			System.out.println("node " + val + " has removed.");
			print();
		}

	}

	public static void delEnd() {
		if (size == 0) {
			System.out.println("under flow");
		}
		else if (size == 1) {
			head = tail = null;
			size = 0;
		} 
		else {

			node temp = head;
			for (int i = 0; i < size - 2; i++) {
				temp = temp.next;
			}
			int val = temp.next.data;
			temp.next = null;
			tail = temp;
			System.out.println("node " + val + " has removed.");
			print();
			size--;
		}

	}

	public static void delAt(int id) {
		if (size == 0) {
			System.out.println("under flow");
		} 
		else if (size == 1) {
			head = tail = null;
			size = 0;
		}
		else if (size == 1 && size != id) {
			System.out.println("under flow");
		} 
		else {
			node temp = head;
			for (int i = 1; i < id - 1; i++) {
				temp = temp.next;
			}
			temp.next = temp.next.next;
			size--;
		}
		print();
	}

	public static int search(int key) {
		
		int count = 1;
		for (node temp = head; temp != null; temp = temp.next) {
			if (temp.data == key) {
				return count;
			} else
				count++;

		}
		return -1;

	}
	public static node reverse(node hed) {

		node prev=null;
		node curr=tail=head;
		while(curr!=null) {
			node next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
			
		}
	head=prev;
	print();
	return head;
	}
	
	public static void sort() {
		for (node temp = head; temp.next != null; temp = temp.next) {
			for(node temp2=head;temp2.next!=null;temp2=temp2.next) {
				if(temp2.data>temp2.next.data) {					
					int t=temp2.data;
					temp2.data=temp2.next.data;
					temp2.next.data=t;
				}
			}
		}
		print();
	}

	public static node findMid() {
		int n=size/2;
		node temp=head;
		while(n!=0) {
			temp=temp.next;
			n--;
		}
		System.out.println(temp.data);
		return temp;
	}
	public static void ZigZag() {//Malfunction of code 13
		node mid =findMid();
		node LH=head;
		node R=mid.next;
		node RH=reverse(R);
		mid.next=null;
		node NxtR,NxtL;
		
		while(RH!=null&&LH!=null) {
			NxtL=LH.next;
			LH.next=RH;
			NxtR=RH.next;
			RH.next=NxtL;
			
			RH=NxtR;
			LH=NxtL;
					
		}
		print();
	}
	
	public static void main(String[] args) {

		while (true) {
			System.out.println();
			System.out.println();
			System.out.println("<----------!!!  MENU   !!!------------>");
			System.out.println("1:For Add node.\n" 
			        + "2:For Add at first location.\n" 
					+ "3:For Add at  any location.\n"
					+ "4:For Deleate at begine.\n" 
					+ "5:For Deleate at end.\n" 
					+ "6:For Deleate at any location.\n"
					+ "7:For Search for an element.\n" 
					+ "8:For Finding size of the linked list.\n"
					+ "9:For Reverse the Link List.\n"
					+ "10:For Sort the LinkedList\n"
					+ "11:For Display the LinkedList.\n"
					+ "12:For Middle Element.\n"
					+ "13:For ZigZag the linked list.\n" 
					+ "14:For Exit form code:");
			System.out.print("Enter your chioce:");

			int chs = sc.nextInt();
		
			if (chs == 1 || chs == 2 || chs == 3 || chs == 4 || chs == 5 || chs == 6 || chs == 7 || chs == 8 || chs == 9
					|| chs == 10||chs==11||chs==12||chs==13||chs==14) {
				
				switch (chs) {
				case 1:
					System.out.print("Enter the element you wana add:");
					int el = sc.nextInt();
					addEnd(el);
					break;
				case 2:
					System.out.print("Enter the element which you wanna add at head:");
					int el1 = sc.hashCode();
					addEnd(el1);
					break;
				case 3:
					System.out.print("Enter the index which you wanna add:");
					int id = sc.nextInt();
					System.out.print("Enter the element you wanna add at that location:");
					int ele2 = sc.nextInt();
					insAt(id, ele2);
					break;
				case 4:
					delBeg();
					break;
				case 5:
					delEnd();
					break;
				case 6:
					System.out.print("Enter the location which you wanna delete:");
					int id1 = sc.nextInt();
					delAt(id1);
					break;
				case 7:
					System.out.print("Enter the element which you wanna search:");
					int ele3 = sc.nextInt();
					System.out.println("The Index is: "+search(ele3));
					break;
				case 8:
					System.out.println("The size of the Linked List is: " + size());
					break;
				case 9:
					reverse(head);
					break;
				case 10:
					sort();
					break;
				case 11:
					print();
					break;
				case 12: 
					findMid();
					break;
				case 13:
					ZigZag();
					break;
				case 14:
					System.exit(0);
										break;
				}
			}
			else {
				System.out.println("invalid Input.");
			}
		}

	}

}