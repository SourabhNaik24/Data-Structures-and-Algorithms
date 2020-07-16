package basic;

import java.util.*;

public class CountNumberOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		long n = sc.nextLong();
		
		System.out.println("Number of Digits: " + (int)Math.floor(Math.log10(n) + 1));

	}

}
