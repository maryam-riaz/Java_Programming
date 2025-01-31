import java.util.Scanner;
public class Comparison {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a value: ");
		float n1= input.nextFloat();
		System.out.print("Enter a value: ");
		float n2 = input.nextFloat();

		if(n1 == n2) 
			System.out.println(n1 +" == "+ n2);
		if(n1 >= n2) 
			System.out.println(n1 +" >= "+ n2);
		if(n1 <= n2) 
			System.out.println(n1 +" <= "+ n2);
		if(n1 != n2) 
			System.out.println(n1 +" != "+ n2);
		if(n1 > n2) 
			System.out.println(n1 +" > "+ n2);
		if(n1 < n2) 
			System.out.println(n1 +" < "+ n2);
		input.close();
	}
	
}
