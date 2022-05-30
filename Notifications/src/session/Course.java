package session;


import java.util.ArrayList;

import communication.EmailGateway;
import communication.Gateway;
import announcement.TaskAddedEmailMessage;
import consumer.Professor;
import consumer.Student;
import consumer.TA;
import notification.TaskAdded;

public class Course implements ICourse{
	
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
	
	@Override
	public void subscribeProfessorEmail(Professor professor) {
		professorsForEmailNotification.add(professor);
	}
	
	@Override
	public void subscribeProfessorSMS(Professor professor) {
		professorsForSMSNotification.add(professor);
	}
	
	@Override
	public void subscribeTAEmail(TA ta) {
		tasForEmailNotification.add(ta);
	}
	
	@Override
	public void subscribeTASMS(TA ta) {
		tasForSMSNotification.add(ta);
	}
	
	@Override
	public void subscribeStudentEmail(Student student) {
		studentsForEmailNotification.add(student);
	}
	
	@Override
	public void subscribeStudentSMS(Student student) {
		studentsForSMSNotification.add(student);
	}
	
	
	
	public void addAssignment(String assignName, String assignBody) {
		announcements.add(assignName);
		String[] placeholders = new String[] {assignName, assignBody}; 
		
		notifyAllUsers(placeholders);
	}
	
	// AddExam, PostGrades, PostAnnouncement  will be the same 

	@Override
	public void notifyAllUsers(String[] placeholders) {
		// notify users by email
		TaskAdded msg = new TaskAddedEmailMessage();
		String notification = msg.prepareMessage(placeholders);
		
		// open connection for Email gateway and do some configurations to the object
		
		Gateway emailGateway = new EmailGateway();
		
		
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
