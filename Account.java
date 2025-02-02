public class Account {
	private String name; // instance variable/attribute //can be placed anywhere within the class,
							// outside any method
	private double balance;

	// constructor
	public Account(){}; //this declaration makes the use of default constructor possible in the client class
	public Account(String name, double balance) {
		this.name = name;
		if (balance > 0.0)
		this.balance = balance;
	}
	// method to set name
	public void setName(String n) {
		name = n;
	}
	// method to retrieve name
	public String getName() {
		return name;
	}
	//balance getter 
	public double getBalance(){
		return balance;
	}
	//deposit 
	public void deposit(double depositAmount){
		if(depositAmount>0.0)
			balance += depositAmount;
	}


} // end of Account class
