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
public class Student extends AnyParty{
	private String studentName;
	private String studentID;
	private String studentEmail;
	private String studentStatus;
	boolean Evidence;

    public Student(String name) {
        super(name);
    }
	

	public void  verifyEvidence(){
		checkEvidence(Evidence);
	}
	public boolean checkEvidence(boolean Evidence)
	{
		return Evidence; // return as true/ false
	}
	public void makeChoice(){	
	}
	public void requestAdvice(){	
	}
	public void registerClass(){	
	}
	public void dropClass(){	
	}

}

