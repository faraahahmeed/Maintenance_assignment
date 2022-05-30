package session;

import consumer.Professor;
import consumer.TA;
import consumer.Student;

public interface ICourse
{
    //adding professors to list
    public void subscribeProfessorEmail(Professor professor); 
	
	public void subscribeProfessorSMS(Professor professor);
    
	//adding TAs to list
	public void subscribeTAEmail(TA ta);

	public void subscribeTASMS(TA ta);
	
	//adding students to list
    public void subscribeStudentEmail(Student student);

	public void subscribeStudentSMS(Student student);

    //Notify users
    public
     void notifyAllUsers(String[] placeholders);
    
	
}
