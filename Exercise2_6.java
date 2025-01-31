// Java: How to Program by Harvey Deitel  (2.6)
// program to calculate the product of three integers 

import java.util.Scanner;

public class Exercise2_6 {
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);

		int x;
		int y;
		int z;
		int result;

		System.out.print("Enter first integer: ");
		x = input.nextInt();
		System.out.print("Enter second integer: ");
		y = input.nextInt();
		System.out.print("Enter third integer: ");
		z = input.nextInt();

		result = x * y * z;

		System.out.printf("Product is %d%n", result);
		 
		input.close();
	}
}
