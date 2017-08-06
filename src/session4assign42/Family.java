/**
 * Family.java 
 * version  1.1
 * compiled on 6th August 2017
 */
package session4assign42;
/**
 * 
 * This class will assist in HAS-A relationship along with parent class CompanyStaff.java.
 * 
 * @author Chhaya Yadav
 *
 */
public class Family {
	
// Instance Variable declaration
	
	private String fathersName ;
	
	private String mothersName ;
	
	private String nominee ;
	
	private int noOfDependents ;
	
	private String homeAddress ;

//Declaration of GET-SET Methods for CLASS Instance Variables

public String getHomeAddress() {
		return homeAddress;
	}

public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}

public String getFathersName() {
		return fathersName;
	}

public void setFathersName(String fathersName) {
		this.fathersName = fathersName;
	}

public String getMothersName() {
		return mothersName;
	}

public void setMothersName(String mothersName) {
		this.mothersName = mothersName;
	}

public String getNominee() {
		return nominee;
	}

public void setNominee(String nominee) {
		this.nominee = nominee;
	}

public int getNoOfDependents() {
		return noOfDependents;
	}

public void setNoOfDependents(int noOfDependents) {
		this.noOfDependents = noOfDependents;
	}
	
//display the object details of object of Family details
	
public String toString(){
		
		String str = "*Father's name :" + this.getFathersName()
				   
				   + "    *Mother's name :" + this.getMothersName()

				   + "    *Nominee       :" + this.getNominee()
				   
				   + "    *No of Dependents :" + this.getNoOfDependents() 
				   
				   + "    *HOME ADDRESS     :" + this.getHomeAddress()
				   
				   ;
				   
	    return str ;
		
	}
				   	

}