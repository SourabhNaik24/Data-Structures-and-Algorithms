// Name: Sourabh Shripad Naik
// Date: 10/06/2020
// Problem Statement: Find all the paths in a nxm grid
// Approach: Recursion

package recursion;

public class PathFinder {
	public static void main(String[] args) {
		System.out.println(path(4,4));
	}
		
	// recursive method
	static int path(int n, int m) {
			
		// base case
		if(n==1 || m==1) {
			return 1;
		}
			
		// recursive call
		return path(n,m-1) + path(n-1,m);
	}
}
