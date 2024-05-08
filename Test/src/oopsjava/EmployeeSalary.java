package oopsjava;

public class EmployeeSalary {

	int id;
	String firstName;
	String lastName;
	int salary;

	// Constructor
	public EmployeeSalary(int a, String b, String c, int d) {
		id = a;
		firstName = b;
		lastName = c;
		salary = d;
	}

	// Getter methods
	public int getID() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getName() {
		return firstName + " " + lastName;
	}

	public int getSalary() {
		return salary;
	}

	// Setter method
	public int setSalary() {
		return salary;
		// this.salary = salary;
	}

	// Method to calculate annual salary
	public int getAnnualSalary() {
		return salary * 12;
	}

	// Method to raise salary by a specified percentage
	public void raiseSalary(int percent) {

		double raise = (100 + percent) / 100.0;
		salary = (int) (salary * raise);
	}

	// Override toString method
	@Override
	public String toString() {
		return "Employee[id=" + id + ",name=" + getName() + ", salary=" + salary + "]";
	}

	// Main method for testing
	public static void main(String[] args) {
		// Create an Employee object
		EmployeeSalary emp = new EmployeeSalary(1, "John", "Doe", 50000);

		// Display initial details
		System.out.println(emp);

		// Raise salary by 10%
		emp.raiseSalary(10);

		// Display updated details
		System.out.println("updated: " + emp);
	}
}