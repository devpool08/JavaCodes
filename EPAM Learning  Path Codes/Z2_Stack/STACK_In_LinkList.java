package Z2_Stack;

import java.util.Scanner;

class nodeo {
	int info;
	nodeo link;

}

public class STACK_In_LinkList {
	static nodeo start = null;

	public static void insBeg() {
		nodeo p = new nodeo();
		Scanner sc = new Scanner(System.in);
		System.out.println("KRIPIYA INFO ENTER KAREN.");
		p.info = sc.nextInt();
		p.link = null;
		if (start == null) {
			start = p;
		} else {
			p.link = start;
			start = p;
		}

	}

	public static void detBeg() {
		if (start == null) {
			System.out.println("AP K PAS UPYUKTA NODE NAHI HY. KRIPIYA OUKAT MAIN RAHEN THANK U");
		} else {
			start = start.link;
		}
	}

	public static void display() {
		while (start != null) {
			System.out.print(start.info + "<--");
			start = start.link;

		}
		System.out.println("null");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println(
					"KRIPIYA ENTER YOUR CHOICE:\n*"
				  + "INSERTION K LIYE 1 DABAIYE\n*"
			      + "DELEATE K LIYE 2 DABAYE\n*DISPLAY K LIYE 3 DABAIYE");
			int ch = sc.nextInt();
			if (ch == 0 || ch == 1 || ch == 2 || ch == 3) {
				switch (ch) {
				case 1:
					insBeg();
					break;
				case 2:
					detBeg();
					break;
				case 3:
					display();
					break;
				case 0:
					System.exit(0);
				default:
					System.out.println("DARU P K TYPE NA KAREN..PLS..");

				}
			} else
				System.out.println("DARU P K TYPE NA KAREN..PLS..");
			System.out.println("HARE KRISHNA");
		}

	}

}
