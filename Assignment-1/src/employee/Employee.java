package employee;

import java.util.ArrayList;

public class Employee {
	// Base Class

	// Fields
	private String name;
	private int id;
	private int salary;
	private ArrayList<String> skills;

	// Constructor
	public Employee(String name, int id, int salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	/** Setters Methods */

	// Sets name of the Employee
	public void setName(String name) {
		this.name = name;
	}

	// Sets id of the Employee
	public void setId(int id) {
		this.id = id;
	}
	// Sets salary of the Employee
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	/** Getter Methods */
	
	// Gets name of the Employee
	public String getName() {
		return name;
	}

	// Gets id of the Employee
	public int getId() {
		return id;
	}

	// Gets salary of the Employee
	public int getSalary() {
		return salary;
	}
	
	/** */
	
	// Returns the skills acquired by a developer
	public ArrayList<String> getSkills() {
		return skills;
	}

	// Adds skills to developer
	public void setSkills(ArrayList<String> skills) {
		this.skills = skills;
	}

	//OverLoaded Method
	// Adds a specific skill to Employee
	public void setSkills(String skill) {
		this.skills.add(skill);
	}
}
