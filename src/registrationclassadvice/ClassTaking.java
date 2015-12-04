/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registrationclassadvice;

/**
 *
 * @author Daniel Nguyen
 */
public class ClassTaking extends AnyEntity {
	private String className;
	private String classType;
	private String classStatus;
	private String classDescription;

    public ClassTaking(int id, String entityName, String entityType, String type, String status, String position) {
        super(id, entityName, entityType, type, status, position);
    }

	public void register() {
	}

	public void drop() {
	}

	public String searchClass() {
		return className;
	}

	public void addPlan() {

	}
}
