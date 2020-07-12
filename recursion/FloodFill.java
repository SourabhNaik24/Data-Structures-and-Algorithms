// Name: Sourabh Shripad Naik
// Date: 12/06/2020
// Problem Statement: Flood Fill
// Approach: Recursion

package recursion;

public class FloodFill {

	public static void main(String[] args) {
		int arr[][] = { { 1, 1, 1, 1, 1, 1, 1},
				{1, 1, 1, 1, 1, 0, 0},
				{1, 0, 1, 1, 0, 0, 1},
				{1, 2, 2, 2, 2, 0, 1},
				{1, 2, 2, 2, 2, 2, 0},
				{1, 2, 2, 2, 1, 2, 0},
				{1, 2, 0, 0, 1, 1, 1},
				{1, 2, 0 ,1, 2, 2, 2},
		};
		floodFill(arr, 7, 3, 4, 1);
		PrintMatrix(arr);
	}
	
	// recursive method
	static void floodFill(int a[][], int r, int c, int next, int prev) {
		int rows = a.length;
		int cols = a[0].length;
		
		// base condition
		if(r < 0 || r >= rows || c < 0 || c >= cols) {
			return;
		}
		if(a[r][c] != prev) {
			return;
		}
		a[r][c] = next;
		
		// recursive call
		floodFill(a,r-1,c,next,prev);
		floodFill(a,r+1,c,next,prev);
		floodFill(a,r,c-1,next,prev);
		floodFill(a,r,c+1,next,prev);
	}
	
	// function to print a Matrix
	static void PrintMatrix(int a[][]) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j] +" ");
			}
			System.out.println();
		}
	}

}
