// Name: Sourabh Shripad Naik
// Date: 10/06/2020
// Problem Statement: Calculate Power of two numbers i.e. a^b
// Approach: [Fast Power] Recursion

package recursion;

public class FastPowerMethod {
	
	static int stepCnt = 0;
	
	//if a=3 and b=4
	// then 3*3*3*3=81
	public static void main(String[] args) {
		System.out.println(fastpower(3,10));
		System.out.println("Steps: "+stepCnt);
	}
		
	// recursive method
	// O(n)
	static int fastpower(int a, int b) {
		System.out.println(b);
		stepCnt++;
		
		// base case
		// a=3 and b=0
		// then 3^0=1
		// i.e power(3,0)
		if(b==0) {
			return 1;
		}
			
		// recursive call
		// power(3,3)*3=power(3,4)
		// where power(3,3) is recursive leap of faith
		if(b%2 == 0) {
			return fastpower(a*a, b/2);
		}
		return a * fastpower(a,b-1);
	}
}
