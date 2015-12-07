
package registrationclassadvice;
import java.util.ArrayList;
import java.util.List;
import registrationclassadvice.AnyMedia;
public class Event {
	private List<AnyMedia> medias;
	private String eventName;
	private String eventLocation;
	private ArrayList<String> attendees;
	
	public Event(String name, String location, ArrayList<String> people) {
		eventName = name;
		eventLocation = location;
		attendees = people;
	}
	
	public String getEventName() {
		return eventName;
	}
	
	public String getEventLocation() {
		return eventLocation;
	}
	
	public ArrayList<String> getAttendees() {
		return attendees;
	}
	public void recordedOn(List<AnyMedia> anyMedias) 
	{   
		this.medias = anyMedias;  
	}
	public List<AnyMedia> getMedias()
	{   
		return medias;
	}
	public void setMedias(List<AnyMedia> medias) 
	{  
		this.medias = medias;  
		
	}
	
}
