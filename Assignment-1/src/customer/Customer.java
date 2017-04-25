package customer;

public class Customer {
	private String name;
	private String userName;
	private String email;
	private Address address;
	private DOB dob;

	// Constructor
	public Customer(String name, String userName, String email, Address address, DOB dob) {
		this.name = name;
		this.userName = userName;
		this.email = email;
		this.address = address;
		this.dob = dob;
	}

	// Setter and Getter Methods

	// Gets name of the customer
	public String getName() {
		return name;
	}

	// Sets Name of the customer
	public void setName(String name) {
		this.name = name;
	}

	//Gets User Name of the customer
	public String getUserName() {
		return userName;
	}

	//Sets User Name of the customer
	public void setUserName(String userName) {
		this.userName = userName;
	}

	//Gets Email Id of the customer
	public String getEmail() {
		return email;
	}

	//Sets Email id of the customer
	public void setEmail(String email) {
		this.email = email;
	}

	// Returns Address of the customer
	public String getAddress() {
		return address.toString();
	}

	//Sets Address of the Customer
	public void setAddress(Address address) {
		this.address = address;
	}

	// Returns DOB of the customer
	public String getDob() {
		return dob.toString();
	}

	//Sets DOB of the customer
	public void setDob(DOB dob) {
		this.dob = dob;
	}

}
