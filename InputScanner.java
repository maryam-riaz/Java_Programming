import java.util.Scanner; 						// for input 
public class InputScanner {
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);	// specifies instance for keyboard input 

		System.out.print("Enter first integer: ");
		int num1 = sc.nextInt();				// nextInt() method used for integer input 
												// intNext() input can't be assigned to a double type variable
		System.out.print("Enter second integer: ");
		int num2 = sc.nextInt();
		int sum = num1+num2;
		System.out.printf("Sum: "+sum);
		sc.close();
	}
}
