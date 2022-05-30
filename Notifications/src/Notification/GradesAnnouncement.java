package notification;

public interface GradesAnnouncement {
    public String prepareMessage(String [] placeHolders);
	public boolean verifyGrades();
}
