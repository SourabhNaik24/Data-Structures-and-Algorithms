// Name: Sourabh Shripad Naik
// Date: 10/06/2020
// Problem Statement: Find sum of first N natural numbers
// Approach: Recursion

package recursion;

public class SumNNaturalNumbers {
	// if n=5 
	// then 1+2+3+4+5=15
	public static void main(String[] args) {
		System.out.println(sum(15));
	}
	
	// recursive method
	static int sum(int n) {
		
		// base case
		//  sum(1)=1
		if(n==1) {
			return 1;
		}
		
		// recursive call
		// [recursive leap of faith -> sum(4)]
		// sum(4)+5=sum(5)
		// n+sum(n-1)=sum(n)
		return n + sum(n-1);
	}

}
