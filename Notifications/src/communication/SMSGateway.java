package communication;

import announcement.DailyNewsMobileMessage;
import announcement.GradesAnnouncementMobileMessage;
import announcement.TaskAddedMobileMessage;
import notification.DailyNews;
import notification.GradesAnnouncement;
import notification.TaskAdded;

public class SMSGateway implements Gateway{
	
	public void sendMessage(Object message) {
		String[] placeHolders = new String[] {}; // set some place holders here 
		DailyNews dailyNewsSMSMessage;
		GradesAnnouncement announcementSMSMessage;
		TaskAdded addedSMSMessage;
		
		if(message instanceof DailyNewsMobileMessage) {
			dailyNewsSMSMessage = (DailyNewsMobileMessage) message;
			
			dailyNewsSMSMessage.prepareMessage(placeHolders);
			
			// some code to send message
		}
		
		else if(message instanceof GradesAnnouncementMobileMessage) {
			announcementSMSMessage = (GradesAnnouncementMobileMessage) message;
			
			announcementSMSMessage.prepareMessage(placeHolders);
			
			// some code to send message
		}
		
		else if(message instanceof TaskAddedMobileMessage) {
			addedSMSMessage= (TaskAddedMobileMessage) message;
			
			addedSMSMessage.prepareMessage(placeHolders);
			
			// some code to send message to user
		}
		
	}
}
