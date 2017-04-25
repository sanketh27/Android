package customer;

public class Address {
	private int hno;
	private String street;
	private String locality;
	private String dist;
	private String state;
	private int pincode;
	private String landmark;

	// Constructor
	public Address(int hno, String street, String locality, String dist, String state, int pincode, String landmark) {
		this.hno = hno;
		this.street = street;
		this.locality = locality;
		this.dist = dist;
		this.state = state;
		this.pincode = pincode;
		this.landmark = landmark;
	}

	// Gets H.No of the Customer
	public int getHno() {
		return hno;
	}

	// Sets H.No of the Customer
	public void setHno(int hno) {
		this.hno = hno;
	}

	// Gets Street of the Customer
	public String getStreet() {
		return street;
	}

	// Sets Street of the Customer
	public void setStreet(String street) {
		this.street = street;
	}

	// Gets locality of the Customer
	public String getLocality() {
		return locality;
	}

	// Sets locality of the Customer
	public void setLocality(String locality) {
		this.locality = locality;
	}

	// Gets Distance of the Customer
	public String getDist() {
		return dist;
	}

	// Sets Distance of the Customer
	public void setDist(String dist) {
		this.dist = dist;
	}

	// Gets State of the Customer
	public String getState() {
		return state;
	}

	// Sets State of the Customer
	public void setState(String state) {
		this.state = state;
	}

	// Gets Pin Code of the Customer
	public int getPincode() {
		return pincode;
	}

	// Sets Pin Code of the Customer
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	// Gets Landmark near of the Customer Address
	public String getLandmark() {
		return landmark;
	}

	// Sets Landmark near of the Customer Address
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String toString() {
		return hno + "/n" + street + "/n" + locality + "/n" + dist + "/n" + state + "/n" + pincode;
	}

}
