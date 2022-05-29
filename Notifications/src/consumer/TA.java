package consumer;

public class TA {
	String name;
	String department;
	String email;
	String phoneNumber;
	
	

	public TA(String name, String department, String email, String phoneNumber) {
		super();
		this.name = name;
		this.department = department;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}


	public String getEmail() {
		return email;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public String getName() {
		return name;
	}


	public String getDepartment() {
		return department;
	}
	
	public void notifyTA(String message) {
		// do some stuff
		
	}
	
}
