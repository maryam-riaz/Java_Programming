import java.util.Scanner;

public class AccountTest {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Account myAccount = new Account();

		System.out.println("Initial account name: "+myAccount.getName());
		System.out.print("Enter name: ");
		myAccount.setName(input.nextLine());

		System.out.println("Account name: "+ myAccount.getName());

		input.close();
	}
}
