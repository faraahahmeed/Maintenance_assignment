package communication;

import announcement.DailyNewsEmailMessage;
import announcement.GradesAnnouncementEmailMessage;
import announcement.TaskAddedEmailMessage;
import notification.DailyNews;
import notification.GradesAnnouncement;
import notification.TaskAdded;

public class EmailGateway implements Gateway{
	
	public void sendMessage(Object message) {
		String[] placeHolders = new String[] {}; // set some place holders here
		DailyNews dailyNewsEmailMessage;
		GradesAnnouncement announcementEmailMessage;
		TaskAdded addedEmailMessage;
		
		if(message instanceof DailyNewsEmailMessage) {
			dailyNewsEmailMessage = (DailyNewsEmailMessage) message;
			
			dailyNewsEmailMessage.prepareMessage(placeHolders);
			
			// some code to send message
		}
		
		else if(message instanceof GradesAnnouncementEmailMessage) {
			announcementEmailMessage = (GradesAnnouncementEmailMessage) message;
			
			announcementEmailMessage.prepareMessage(placeHolders);
			
			// some code to send message
		}
		
		else if(message instanceof TaskAddedEmailMessage) {
			addedEmailMessage = (TaskAddedEmailMessage) message;
			
			addedEmailMessage.prepareMessage(placeHolders);
			
			// some code to send message by email to user
		}
		
	}
}
