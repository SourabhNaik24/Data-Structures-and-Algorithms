// Name: Sourabh Shripad Naik
// Date: 14/06/2020
// Problem Statement: Game Theory
// Approach: Recursion

package recursion;

public class GameTheory {

	public static void main(String[] args) {
		int a[] = {1, 5, 700, 2};
		System.out.println(coinMax(a, 0, a.length-1));
	}
	
	// recursive method
	static int coinMax(int a[], int l, int r) {
		
		// base condtion
		if(l+1 == r) {

			return Math.max(a[l], a[r]);

		}

		// recursive call
		return Math.max(a[l] + Math.min(coinMax(a, l+2, r), coinMax(a, l+1, r-1)), 
					    a[r] + Math.min(coinMax(a, l+1, r-1), coinMax(a, l, r-2)));

	}

}
