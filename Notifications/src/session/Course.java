package session;


import java.util.ArrayList;

import communication.EmailGateway;
import announcement.TaskAddedEmailMessage;
import consumer.Professor;
import consumer.Student;
import consumer.TA;

public class Course {
	
	String name;
	String code;
	ArrayList<String> announcements = new ArrayList<>();
	ArrayList<String> exams = new ArrayList<>();
	ArrayList<String> grades = new ArrayList<>();
	
	ArrayList<Professor> professorsForEmailNotification = new ArrayList<>();
	ArrayList<Professor> professorsForSMSNotification = new ArrayList<>();
	
	ArrayList<TA> tasForEmailNotification = new ArrayList<>();
	ArrayList<TA> tasForSMSNotification = new ArrayList<>();
	
	ArrayList<Student> studentsForEmailNotification = new ArrayList<>();
	ArrayList<Student> studentsForSMSNotification = new ArrayList<>();
	
	public Course(String name, String code) {
		super();
		this.name = name;
		this.code = code;
	}

	public String getName() {
		return name;
	}


	public String getCode() {
		return code;
	}
	
	public void subscribeProfessorForEmailNotification(Professor professor) {
		professorsForEmailNotification.add(professor);
	}
	
	public void subscribeProfessorForSMSNotification(Professor professor) {
		professorsForSMSNotification.add(professor);
	}
	
	public void subscribeTAForEmailNotification(TA ta) {
		tasForEmailNotification.add(ta);
	}
	
	public void subscribeTAForSMSNotification(TA ta) {
		tasForSMSNotification.add(ta);
	}
	
	public void subscribeStudentForEmailNotification(Student student) {
		studentsForEmailNotification.add(student);
	}
	
	public void subscribeStudentForSMSNotification(Student student) {
		studentsForSMSNotification.add(student);
	}
	
	
	
	public void addAssignment(String assignName, String assignBody) {
		announcements.add(assignName);
		String[] placeholders = new String[] {assignName, assignBody};
		// do some logic here 
		
		notifyAllUsers(placeholders);
	}
	
	// AddExam, PostGrades, PostAnnouncement  will be the same 

	private void notifyAllUsers(String[] placeholders) {
		// notify users by email
		TaskAddedEmailMessage msg = new TaskAddedEmailMessage();
		String notification = msg.prepareMessage(placeholders);
		
		// open connection for Email gateway and do some configurations to the object
		
		EmailGateway emailGateway = new EmailGateway();
		
		
		for (Professor professor : professorsForEmailNotification) {
			professor.notifyProfessor(notification);
			emailGateway.sendMessage(notification);
		}
		
		for (TA ta : tasForEmailNotification) {
			ta.notifyTA(notification);
			emailGateway.sendMessage(notification);
		}
		
		for (Student student : studentsForSMSNotification) {
			student.notifyStudent(notification);
			emailGateway.sendMessage(notification);
		}
	}
	
	
	
	
}
