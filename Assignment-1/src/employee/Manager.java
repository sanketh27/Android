package employee;

import java.util.ArrayList;

public class Manager extends Employee {
	// Sub Class of Employee

	private final String designation = "Manager";
	private ArrayList<Developer> members;

	// Constructor
	public Manager(String name, int id, int salary) {
		super(name, id, salary);
	}

	// Setters and Getter Methods

	// Gets the designation of the Employee
	public String getDesig() {
		return designation;
	}

	// Returns List of Developers under a Manager
	public ArrayList<Developer> getMembers() {
		return members;
	}

	// Adds Developer under a Manager
	public void setMembers(ArrayList<Developer> members) {
		this.members = members;
	}
}
