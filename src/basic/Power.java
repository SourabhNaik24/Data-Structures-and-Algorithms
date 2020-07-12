package basic;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter X: ");
		int x = sc.nextInt();
		System.out.println("Enter Y: ");
		int y = sc.nextInt();
		
		int result = 1;
		
		for(int i = 0; i < y; i++) {
			result *= x;
		}
		
		System.out.println(result);

	}

}
