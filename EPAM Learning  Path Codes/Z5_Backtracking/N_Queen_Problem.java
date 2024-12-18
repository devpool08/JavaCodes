package Z5_Backtracking;

public class N_Queen_Problem {
	public static void n_qn(char[][] bord,int row) {
		if(row== bord.length) {
			print(bord);
			return;
		}
		for(int j=0;j<bord.length;j++) {
			bord[row][j]='Q';
			n_qn(bord,row+1);
			bord[row][j]='_';
			
		}
	}
	public static void print(char[][] bord) {
		System.out.println("<----BOARD---->");
		for(int i=0;i<bord.length;i++) {
			
			for(int j=0;j<bord.length;j++) {
				System.out.print(bord[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int n=4;

		char bord[][]=new char[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				bord[i][j]='_';
			}
		}
		n_qn(bord,0);
		
	}

}
