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
public class Counselor extends AnyParty{
	private String counselorName;
	private String counselorID;
	private String counselorEmail;
	private String counselorStatus;
	boolean Evidence;

    public Counselor(String name) {
        super(name);
    }
}
