package Z4_Heap;

import java.util.ArrayList;

public class BldHep {
	public static class Heap{
		static ArrayList<Integer> arr=new ArrayList<>();

		public void add(int data) {//MinHeap : minValue at the top; 
			arr.add(data);
			int cld=arr.size()-1;//child index;
			int par=(cld-1)/2;//parent index;
			while(arr.get(cld)<arr.get(par)) {
				int temp=arr.get(cld);
				arr.set(cld, arr.get(par));
				arr.set(par,temp);
							
				cld=par;
				par=(cld-1)/2;
				
			}
			
		}
		public int peak() {
			return arr.get(0);
		}
		public static int remove() {
			int data=arr.get(0);
			//swapping
			int temp=data;
			arr.set(0,arr.get(arr.size()-1));
			arr.set(arr.size()-1,temp);
			//Deletion;
			arr.remove(arr.size()-1);
			//Calling HeapIfy;
			Heapify(0);
			return data;
		}
		private static void Heapify(int i) {
			int p=i;//parent 
			int l=(i*2)+1;//left child
			int r=l+1;//right child
			int min=p;
			//checking whether l & r dintn't exceed size of array  
			if(l<arr.size()&&arr.get(min)>arr.get(l)) {
				min=l;
			}
			if(r<arr.size()&&arr.get(min)>arr.get(r)) {
				min=r;
			}
			if(min!=p) {
				int temp=arr.get(p);
				arr.set(p, arr.get(min));
				arr.set(min,temp);
				//Calling HeapIfy for minIndex
				Heapify(min);
			}
			
			
		}
		public boolean isEmpyt() {
			return arr.size()==0;
		}
	}

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Heap hp=new Heap();
		hp.add(3);
		hp.add(4);
		hp.add(7);
		hp.add(5);
		hp.add(12);
		hp.add(8);
		while(!hp.isEmpyt()) {
			System.out.println(hp.peak());
			hp.remove();
		}
		
	}
	//zero one knap sac?
	

}
