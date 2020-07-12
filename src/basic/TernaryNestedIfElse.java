// Name: Sourabh Shripad Naik
// Basics

package basic;

public class TernaryNestedIfElse {

	public static void main(String[] args) {
		int a = 8, b = 12, c = 10, result = 0;
		result = a > b ? a > c ? a : c : b > c ? b : c ;
		System.out.println("Biggest number is "+result);
	}

}
