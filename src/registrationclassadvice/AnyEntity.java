
package registrationclassadvice;

public class AnyEntity {
	private int id;

	private String entityName;
	private String entityType;
	private String type;
	private String status;
	private String position;
	private String[] states;

	public AnyEntity(int id, String entityName, String entityType, String type, 	
		String status, String position) {
		this.id = id;
		this.entityName = entityName;
		this.entityType = entityType;
		this.type = type;
	}

	public String status() {
		return status;
	}

}
