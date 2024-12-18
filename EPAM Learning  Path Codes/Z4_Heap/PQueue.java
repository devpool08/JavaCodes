package Z4_Heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PQueue {
	public static class Student implements Comparable<Student> {
		String name;
		int roll;
		
		public Student (String name,int roll) {
			this.name=name;
			this.roll=roll;
			
		}

		@Override
		public int compareTo(Student s2) {
			// TODO Auto-generated method stub
			return this.roll-s2.roll;
		}
	}

	public static void main(String[] args) {
		PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
		pq.add(3);//O(log n)
		pq.add(4);
		pq.add(1);
		pq.add(7);
		while(!pq.isEmpty()) {
			System.out.println(pq.peek());//O(1);
			pq.remove();//O(n log n)
			
		}
	}

}
