package basic;

import java.util.Scanner;

public class CalculatorSwitchCase {

	public static void main(String[] args) {
		float result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		float a = sc.nextFloat();
		System.out.println("Enter second number: ");
		float b = sc.nextFloat();
		System.out.println("Enter the operation to be performed: ");
		sc.nextLine();
		char op = sc.nextLine().charAt(0);
		sc.close();
		switch(op) {
		// case 1:
		// case 2:
		// print ....
		// break
		case '+' :
			result = a + b;
			System.out.println("Result: "+result);
			break;
		case '-' :
			result = a - b;
			System.out.println("Result: "+result);
			break;
		case '*' :
			result = a * b;
			System.out.println("Result: "+result);
			break;
		case '/' :
			result = a / b;
			System.out.println("Result: "+result);
			break;
		default:
			System.out.println("Invalid Operation");
		}
				
	}

}
