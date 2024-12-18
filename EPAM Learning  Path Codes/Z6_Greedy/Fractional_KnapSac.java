package Z6_Greedy;

import java.util.Arrays;
import java.util.Comparator;

public class Fractional_KnapSac {

	public static void main(String[] args) {
		int val[]= {120,100,60};
		int wet[]= {30,20,10};
		int[][] ratio=new int[val.length][2];
		for(int i=0;i<val.length;i++) {
			ratio[i][0]=i;
			ratio[i][1]=val[i]/wet[i];			
		}
		Arrays .sort(ratio,Comparator.comparingDouble(o -> o[1]));
		int capa=50;
		int ans=0;
		for(int i=ratio.length;i>=0;i--) {
			int idx= ratio[i][0];
			if(capa>=wet[idx]) {
				ans+=val[idx];
				capa-=wet[idx];
			}
			else {
				ans= (capa*ratio[i][1]);
				capa=0;
				break;
			}
		}
		System.out.println(ans);
	}

}
