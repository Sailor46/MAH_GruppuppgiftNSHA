package biblio;

public class Person {

	// fields
	private String name; // name of person
	private int maximumBooks; // most books the person can check out
	private String personNo;
	private String phone;
	
	// constructor
	public Person(String personNo, String name, String phone) {
		this.personNo = personNo;
		this.name = name;
		maximumBooks = 3;
		this.phone = phone;
	}

	// methods
	public String getName() {
		return name;
	}

	public void setName(String anyName) {
		name = anyName;
	}

	public int getMaximumBooks() {
		return maximumBooks;
	}

	public void setMaximumBooks(int maximumBooks) {
		this.maximumBooks = maximumBooks;
	}
	
	public String getPersonNo() {
		return personNo;
	}

	public void setPersonNo(String personNo) {
		this.personNo = personNo;
	}
	
	public String toString()	{
		String res = (personNo + " " + name + " " + phone);
		return res;
	}

}
