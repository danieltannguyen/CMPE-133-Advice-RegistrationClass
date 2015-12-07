
package registrationclassadvice;
import java.util.List;

public class Ownership {
	boolean isOwner = false;
        String domain;
        String name;
  
        private AnyParty party; 
        private Context context;
        
        public void doneBy(AnyParty party)
        {  
            this.setParty(party); 
        }   
        public String getDomain() {
            return domain; 
        }  public void setDomain(String domain)
        {  
            this.domain = domain; 
        }  public String getName() 
        {   
            return name;
        }  public void setName(String name)
        {  
            this.name = name; 
        }
        public Context getContext()
        {   
            return context; 
        }
        public void setContext(Context context) 
        {
            this.context = context;
        }
        public AnyParty getParty()
        {
            return party;
        }
        public void setParty(AnyParty party) 
        {
            this.party = party;
        }
}
