package consumer;

import java.util.ArrayList;

public class Student implements IObserver{
	String name;
	int identity;
	String email;
	String phoneNumber;
	ArrayList <String> sms= new ArrayList<>();
	ArrayList <String> emails= new ArrayList<>();
	
	
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
	
	public void notifyStudent(String message)
	{
		this.updateMe(message);
	}
	
	
	@Override
	public void updateMe(String newUpdate)
	{
		sms.add(newUpdate);
		emails.add(newUpdate);
		System.out.println("you have a new update!: "+ newUpdate);
	}
}
