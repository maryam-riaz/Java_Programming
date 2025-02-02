public class Account {
	private String name; // instance variable/attribute //can be placed anywhere within the class,
							// outside any method

	// method to set name
	public void setName(String n) {
		name = n;
	}

	// constructor
	public Account(String name) {
		this.name = name;
	}

	// method to retrieve name
	public String getName() {
		return name;
	}
} // end of Account class
