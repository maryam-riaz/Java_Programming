public class EmployeeSalaryManagement {
    public static void main(String[] args) {
        // create subclass objects
        SalariedEmployee salariedEmployee = new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40);
        CommissionEmployee commissionEmployee = new CommissionEmployee("Sue", "Jones", "333-33-3333", 0.06, 1000);
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444", 0.04, 3000, 500);

        System.out.println("Employees processed individually:\n");

        System.out.printf("%s\nearned $%,.2f\n\n", salariedEmployee, salariedEmployee.earnings());
        System.out.printf("%s\nearned $%,.2f\n\n", hourlyEmployee, hourlyEmployee.earnings());
        System.out.printf("%s\nearned $%,.2f\n\n", commissionEmployee, commissionEmployee.earnings());
        System.out.printf("%s\nearned $%,.2f\n\n", basePlusCommissionEmployee, basePlusCommissionEmployee.earnings());

        // create four-element Employee array
        Employee[] employees = new Employee[4];

        // initialize array with Employees
        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;

        System.out.println("Employees processed polymorphically:\n");

        // 10 % increase in the base ssalary of the base salaried commission employee
		for (Employee currentEmployee : employees) {
            System.out.println(currentEmployee); 
            if (currentEmployee instanceof BasePlusCommissionEmployee) {
                ((BasePlusCommissionEmployee) currentEmployee).setBaseSalary(1.10 * ((BasePlusCommissionEmployee) currentEmployee).getBaseSalary());

                System.out.printf("new base salary with 10%% increase is: $%,.2f\n", ((BasePlusCommissionEmployee) currentEmployee).getBaseSalary());
            }

            System.out.printf("earned $%,.2f\n\n", currentEmployee.earnings());
        }

        // object's class name 
        for (int j = 0; j < employees.length; j++) {
            System.out.printf("Employee %d is a %s\n", j, employees[j].getClass().getName());
        }
    }
}


abstract class Employee {
	String firstName;
	String lastName;
	String ssn;

	public Employee(String firstName, String lastName, String ssn) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.ssn = ssn;
	}

	public abstract double earnings();

	@Override
	public String toString() {
		return firstName + " " + lastName + "\n Social Security Number: " + ssn + "\n";
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getSSN() {
		return ssn;
	}
}

class SalariedEmployee extends Employee {
	double weeklySalary;

	public SalariedEmployee(String firstName, String lastName, String ssn, double weeklySalary) {
		super(firstName, lastName, ssn);
		if (weeklySalary > 0)
			this.weeklySalary = weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		if (weeklySalary > 0)
			this.weeklySalary = weeklySalary;
	}

	public double getWeeklySalary() {
		return weeklySalary;
	}

	@Override
	public double earnings() {
		return weeklySalary;
	}

	@Override
	public String toString() {
		return "Salaried Employee: " + super.toString() + "Weekly Salary: " + getWeeklySalary() + "\n";
	}
}

class HourlyEmployee extends Employee {
	double wage;
	int hours;

	public HourlyEmployee(String firstName, String lastName, String ssn, double wage, int hours) {
		super(firstName, lastName, ssn);
		if (wage > 0)
			this.wage = wage;
		if (hours >0)
		this.hours = hours;
	}

	public void setWage(double wage) {
		if (wage > 0)
			this.wage = wage;
	}

	public double getWage() {
		return wage;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public int getHours() {
		return hours;
	}

	@Override
	public double earnings() {
		if (hours <= 40)
			return wage * hours;
		else
			return (wage * hours) + (wage * 1.5 * (hours - 40));
	}

	@Override
	public String toString() {
		return "Hourly Employee: " + super.toString() + "Hourly Wage: " + wage + "\n" + "Hours Worked: " + hours + "\n";
	}
}

class CommissionEmployee extends Employee {
	double commissionRate;
	int grossSales;

	public CommissionEmployee(String firstName, String lastName, String ssn, double commissionRate, int grossSales) {
		super(firstName, lastName, ssn);
		if (commissionRate > 0)
			this.commissionRate = commissionRate;
		if (grossSales>0)
		this.grossSales = grossSales;
	}

	public void setCommissionRate(double commissionRate) {
		if (commissionRate > 0)
			this.commissionRate = commissionRate;
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setGrossSales(int grossSales) {
		if (grossSales > 0)
			this.grossSales = grossSales;
	}

	public int getGrossSales() {
		return grossSales;
	}

	@Override
	public double earnings() {
		return commissionRate * grossSales;
	}

	@Override
	public String toString() {
		return "Commission Employee: " + super.toString() + "Commission Rate: " + commissionRate + "\nGross Sales: "
				+ grossSales + "\n";
	}
}

class BasePlusCommissionEmployee extends CommissionEmployee {
	double baseSalary;

	public BasePlusCommissionEmployee(String firstName, String lastName, String ssn, double commissionRate,
			int grossSales, double baseSalary) {
		super(firstName, lastName, ssn, commissionRate, grossSales);
		if (baseSalary > 0)
			this.baseSalary = baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public double earnings() {
		return baseSalary + super.earnings();
	}

	public String toString() {
		return "Base Salaried Commission Employee: " + super.toString() + "Base Salary: " + getBaseSalary() + "\n";
	}
}
