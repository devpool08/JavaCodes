package Z6_Greedy;

import java.util.ArrayList;
import java.util.Collections;

public class Job_seq {
	static class job {
		int dl;// deadline
		int id;// 0,1,2,3..
		int pf;// profit

		job(int i, int d, int p) {
			id = i;
			dl = d;
			pf = p;
		}
	}

	public static void main(String[] args) {
		int[][] jobInfo = { { 4, 20 }, { 1, 10 }, { 1, 40 }, { 1, 30 } };
		ArrayList<job> jobs = new ArrayList<>();
		for (int i = 0; i < jobInfo.length; i++) {
			jobs.add(new job(i,jobInfo[i][0],jobInfo[i][1]));
		}
		Collections.sort(jobs,(a,b)->b.pf-a.pf);
		ArrayList<Integer> ans=new ArrayList<>();
		int time=0;
		for(int i=0;i<jobs.size();i++) {
			job cur=jobs.get(i);
			if(cur.dl>time) {
				ans.add(cur.id);
				time++;
			}
		}
		System.out.println(ans);
			

	}

}
