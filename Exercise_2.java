import java.util.Scanner;

// from the book Java: How to Program by Harvey Deitel 
public class Exercise_2 {
	public static void main(String[] args) {

		// 2.6
		System.out.println("\n********************Exercise 2.6********************");
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

		// 2.10
		System.out.println("\n********************Exercise 2.10********************");
		x = 2;
		y = 3;
		System.out.printf("x = %d%n", x);
		System.out.printf("Value of %d + %d is %d%n", x, x, (x + x));
		System.out.printf("x = \n");
		System.out.printf("%d = %d%n", (x + y), (y + x));
		
		// 2.12
		System.out.println("\n********************Exercise 2.12********************");
		// equivalant of y= ax^3+7
		int a = 2;
		y = a * x * x * x + 7; // correct
		System.out.println("y = " + y);
		y = a * x * x * (x + 7); // incorrect
		System.out.println("y = " + y);
		y = (a * x) * x * (x + 7); // incorrect
		System.out.println("y = " + y);
		y = (a * x) * x * x + 7; // correct
		System.out.println("y = " + y);
		y = a * (x * x * x) + 7; // correct
		System.out.println("y = " + y);
		y = a * x * (x * x + 7); // incorrect
		System.out.println("y = " + y);
		
		// 2.13
		System.out.println("\n********************Exercise 2.13********************");
		x = 7 + 3 * 6 / 2 - 1;
		System.out.println("x = " + x);
		x = 2 % 2 + 2 * 2 - 2 / 2;
		System.out.println("x = " + x);
		x = (3 * 9 * (3 + (9 * 3 / (3))));
		System.out.println("x = " + x);
		
		// 2.14
		System.out.println("\n********************Exercise 2.14********************");
		System.out.println("1 2 3 4");
		System.out.print("1 2 3 4\n");
		System.out.printf("1 2 3 4%n\n");
		
		// 2.15
		System.out.println("\n********************Exercise 2.15********************");
		System.out.print("Enter first integer: ");
		x = input.nextInt();
		System.out.print("Enter second integer: ");
		y = input.nextInt();
		
		System.out.println("Sum = " + (x + y));
		System.out.println("Product = " + (x * y));
		System.out.println("Difference = " + (x - y));
		System.out.println("Quotient = " + (double) (x) / y);
		
		// 2.16
		System.out.println("\n********************Exercise 2.16********************");
		if (x > y)
		System.out.println(x + " is larger.");
		else if (y > x)
		System.out.println(y + " is larger.");
		else
		System.out.println("These numbers are equal.");
		
		// 2.19
		System.out.println("\n********************Exercise 2.19********************");
		System.out.printf("*%n**%n***%n****%n*****%n");
		
		// 2.20
		System.out.println("\n********************Exercise 2.20********************");
		System.out.println("*");
		System.out.println("***");
		System.out.println("*****");
		System.out.println("****");
		System.out.println("**");
		
		// 2.21
		System.out.println("\n********************Exercise 2.21********************");
		System.out.print("*");
		System.out.print("***");
		System.out.print("*****");
		System.out.print("****");
		System.out.println("**");
		
		// 2.22
		System.out.println("\n********************Exercise 2.22********************");
		System.out.print("*");
		System.out.println("***");
		System.out.println("*****");
		System.out.print("****");
		System.out.println("**");
		
		// 2.23
		System.out.println("\n********************Exercise 2.23********************");
		System.out.printf("%s%n%s%n%s%n", "*", "***", "*****");
		
		// 2.24
		System.out.println("\n********************Exercise 2.24********************");
		System.out.println("Enter 5 integers: ");
		a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int d = input.nextInt();
		int e = input.nextInt();
		
		int max = a;
		if (b > max)
		max = b;
		if (c > max)
		max = c;
		if (d > max)
		max = d;
		if (e > max)
		max = e;
		
		int min = a;
		if (b < min)
		min = b;
		if (c < min)
		min = c;
		if (d < min)
		min = d;
		if (e < min)
		min = e;
		
		System.out.println("Largest value is: " + max);
		System.out.println("Smallest value is: " + min);
		
		// 2.25
		System.out.println("\n********************Exercise 2.25********************");
		System.out.print("Enter an integer: ");
		x = input.nextInt();
		if (x % 2 == 0)
		System.out.println(x + " is an even number.");
		else
		System.out.println(x + " is an odd number.");
		
		// 2.27
		System.out.println("\n********************Exercise 2.27********************");
		x = 8;
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < (2 * x); j++) {
				if ((i + j) % 2 == 0)
				System.out.print('*');
				else
				System.out.print(' ');
			}
			System.out.println();
		}
		
		// 2.28
		System.out.println("\n********************Exercise 2.28********************");
		double r;
		System.out.print("Enter the radius of the circle: ");
		r = input.nextDouble();
		System.out.printf("Diameter = %f%n", 2 * r);
		System.out.printf("Circumference = %f%n", 2 * Math.PI * r);
		System.out.printf("Area = %f%n", Math.PI * Math.pow(r, 2));
		
		// 2.29
		System.out.println("\n********************Exercise 2.29********************");
		System.out.printf("The character %c has the value %d%n", 'A', (int) 'A');
		System.out.printf("The character %c has the value %d%n", 'B', (int) 'B');
		System.out.printf("The character %c has the value %d%n", 'C', (int) 'C');
		System.out.printf("The character %c has the value %d%n", 'a', (int) 'a');
		System.out.printf("The character %c has the value %d%n", 'b', (int) 'b');
		System.out.printf("The character %c has the value %d%n", 'c', (int) 'c');
		System.out.printf("The character %c has the value %d%n", '0', (int) '0');
		System.out.printf("The character %c has the value %d%n", '1', (int) '1');
		System.out.printf("The character %c has the value %d%n", '2', (int) '2');
		System.out.printf("The character %c has the value %d%n", '$', (int) '$');
		System.out.printf("The character %c has the value %d%n", '*', (int) '*');
		System.out.printf("The character %c has the value %d%n", '+', (int) '+');
		System.out.printf("The character %c has the value %d%n", '/', (int) '/');
		System.out.printf("The character %c has the value %d%n", ' ', (int) ' ');
		
		// 2.30
		System.out.println("\n********************Exercise 2.30********************");
		do {
			System.out.print("Enter a five-digit positive integer: ");
			x = input.nextInt();
		} while (x > 99999 || x < 10000);
		System.out.printf("%d   %d   %d   %d   %d%n", x / 10000, x / 1000 % 10, x / 100 % 10, x / 10 % 10, x % 10);
		
		// 2.31
		System.out.println("\n********************Exercise 2.31********************");
		System.out.println("Number\tSquare\t Cube");
		for (int i = 0; i <= 10; i++)
		System.out.printf("%d\t\t%d\t\t%d%n", i, (int) Math.pow(i, 2), (int) Math.pow(i, 3));
		
		
		// 2.33
		System.out.println("\n********************Exercise 2.33********************");
		double weight;
		double height;
		double bmi;
		
		System.out.print("Enter weight in pounds: ");
		weight = input.nextDouble();
		System.out.print("Enter height in inches: ");
		height = input.nextDouble();
		
		bmi = (weight * 703) / Math.pow(height, 2);
		if (bmi < 18.5)
		System.out.println("Underweight");
		else if (bmi < 24.9)
		System.out.println("Normal");
		else if (bmi < 29.9)
		System.out.println("Overweight");
		else
		System.out.println("Obese");
		
		
		// 2.34 World Population Growth
		System.out.println("\n********************Exercise 2.34********************");
		long population_2023 = 8091734930L;
		double growth_rate = 0.009; // 0.9%
		double temp = population_2023 * (1 + growth_rate);
		System.out.println("Estimated population 1 year after 2023: " + (long)temp);
		temp *= (1 + growth_rate);
		System.out.println("Estimated population 2 years after 2023: "+ (long)temp);
		temp *= (1 + growth_rate);
		System.out.println("Estimated population 3 years after 2023: "+ (long)temp);
		temp *= (1 + growth_rate);
		System.out.println("Estimated population 4 years after 2023: "+ (long)temp);
		temp *= (1 + growth_rate);
		System.out.println("Estimated population 5 years after 2023: "+ (long)temp);
		System.out.println();

		input.close();
	}
}
