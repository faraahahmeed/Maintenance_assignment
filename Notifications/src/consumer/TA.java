package consumer;

import java.util.ArrayList;

public class TA implements IObserver {
	String name;
	String department;
	String email;
	String phoneNumber;
	ArrayList <String> sms= new ArrayList<>();
	ArrayList <String> emails= new ArrayList<>();
	

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
		this.updateMe(message);
		
	}
	
	@Override
	public void updateMe(String newUpdate) 
	{
		SMS.add(newUpdate);
		Emails.add(newUpdate);
		System.out.println("you have a new update!: "+ newUpdate);
		
	}
	
}
