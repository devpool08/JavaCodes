package Z6_Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Activity_Selection {

	public static void main(String[] args) {
		int start[]= {1,3,0,5,8,5};
		int end[]= {2,4,6,7,9,9};
		int activ[][]=new int [start.length][3];
		for(int i=0;i<start.length;i++) {
			activ[i][0]=i;
			activ[i][1]=start[i];
			activ[i][2]=end[i];
		}
		//We use Lamda Function to sort 2D array according to a specific attribute(for eg here ending time).
		Arrays .sort(activ,Comparator.comparingDouble(o -> o[2]));
		ArrayList<Integer> ans=new ArrayList<>();
		
		ans.add(activ[0][0]);
		int lastEnd=activ[0][2];
		for(int i=1;i<end.length;i++) {
			if(activ[i][1]<lastEnd) {

				ans.add(activ[i][0]);
				lastEnd=activ[i][2];
			}
		}
		for(int i=0;i<ans.size();i++) {
		System.out.print("A"+ans.get(i)+ " ");
		}
	}

}
