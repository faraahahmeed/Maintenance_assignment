package communication;

import announcement.DailyNewsMobileMessage;
import announcement.GradesAnnouncementMobileMessage;
import announcement.TaskAddedMobileMessage;

public class SMSGateway {
	
	public void sendMessage(Object message, String user) {
		String[] placeHolders = new String[] {}; // set some place holders here 
		
		if(message instanceof DailyNewsMobileMessage) {
			DailyNewsMobileMessage msg = (DailyNewsMobileMessage) message;
			
			msg.prepareMessage(placeHolders);
			
			// some code to send message
		}
		
		else if(message instanceof GradesAnnouncementMobileMessage) {
			GradesAnnouncementMobileMessage msg = (GradesAnnouncementMobileMessage) message;
			
			msg.prepareMessage(placeHolders);
			
			// some code to send message
		}
		
		else if(message instanceof TaskAddedMobileMessage) {
			TaskAddedMobileMessage msg = (TaskAddedMobileMessage) message;
			
			msg.prepareMessage(placeHolders);
			
			// some code to send message to user
		}
		
	}
}