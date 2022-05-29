package consumer;

public class Student {
	String name;
	int identity;
	String email;
	String phoneNumber;
	
	
	
	public Student(String name, int id, String email, String phoneNumber) {
		super();
		this.name = name;
		identity = id;
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


	public int getId() {
		return identity;
	}
	
	
	public void notifyStudent(String message) {
		// do some stuff
	}
	
}
