package customer;

public class DOB {
	private int date;
	private int mon;
	private int year;

	// Constructor
	public DOB(int date, int mon, int year) {
		this.date = date;
		this.mon = mon;
		this.year = year;
	}

	// DOB in String format representation.
	public String toString() {
		return date + "/" + mon + "/" + year;
	}

	// Gets Date of DOB
	public int getDate() {
		return date;
	}

	// Sets Date of DOB
	public void setDate(int date) {
		this.date = date;
	}

	// Gets Month of DOB
	public int getMon() {
		return mon;
	}

	// Sets Month of DOB
	public void setMon(int mon) {
		this.mon = mon;
	}

	// Gets year of DOB
	public int getYear() {
		return year;
	}

	// Sets year of DOB
	public void setYear(int year) {
		this.year = year;
	}

}
