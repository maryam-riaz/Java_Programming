import java.math.BigDecimal;
import java.util.Scanner;

public class AccountTest {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		//Account myAccount1 = new Account();		// use of default constructor 

		System.out.print("Enter name and balance: ");
		Account myAccount = new Account(input.nextLine(), input.nextDouble()); // use of parameterized constructor

		//myAccount.setName(input.nextLine());

		System.out.println("Account name: "+ myAccount.getName());
		System.out.println("Account balance: "+ BigDecimal.valueOf(myAccount.getBalance()));


		input.close();
	}
}
