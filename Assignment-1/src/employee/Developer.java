package employee;

import java.util.ArrayList;

public class Developer extends Employee {
	// Sub Class of Employee

	private final String designation = "Developer"; // Designation
	private String mName; // Manager Name

	// Constructor
	public Developer(String name, int id, int salary) {
		super(name, id, salary);
	}

	// Setter and Getter Methods

	// Gets the designation of Employee
	public String getDesig() {
		return designation;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getDesignation() {
		return designation;
	}

}
