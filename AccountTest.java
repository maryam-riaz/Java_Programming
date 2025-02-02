import java.util.Scanner;

public class AccountTest {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		//Account myAccount = new Account();		// use of default constructor 

		System.out.print("Enter name: ");
		Account myAccount = new Account(input.nextLine()); // use of parameterized constructor

		//myAccount.setName(input.nextLine());

		System.out.println("Account name: "+ myAccount.getName());

		input.close();
	}
}
