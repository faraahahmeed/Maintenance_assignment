package consumer;

import java.sql.Date;
import java.util.ArrayList;

public class Professor implements IObserver {
	String name;
	String department;
	Date hirringDate;
	String degree;
	String email;
	String phoneNumber;
	ArrayList <String> sms= new ArrayList<>();
	ArrayList <String> emails= new ArrayList<>();
	
	
	public Professor(String name, String department, Date hirringDate, String phDTopic, String email,
			String phoneNumber) {
		super();
		this.name = name;
		this.department = department;
		this.hirringDate = hirringDate;
		degree = phDTopic;
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

	public Date getHirringDate() {
		return hirringDate;
	}

	public String getPhDTopic() {
		return degree;
	}
	
	public void notifyProfessor(String message) {
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
