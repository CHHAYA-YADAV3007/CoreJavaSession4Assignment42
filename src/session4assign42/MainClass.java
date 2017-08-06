/**
 * MainClass.java 
 * version  1.1
 * compiled on 6th August 2017
 */
package session4assign42;
/**
 * 
 * This class will depict the main method to illustrate the IS-A & HAS-A relationship.
 * 
 * @author Chhaya Yadav
 *
 */
public class MainClass {
	
	public static void main(String[] args){
		
// Class object instantiation to implement HAS-A relationship
		
		Family f1 = new Family();
		
		f1.setFathersName("RAMANUJAM");
		
		f1.setMothersName("SUHASHINI");
		
		f1.setNominee("FATHER");
		
		f1.setNoOfDependents(3);
		
		f1.setHomeAddress("SAGAR M.P. INDIA");
		
// Child class object instantiation
		
		TempStaff ts = new TempStaff();

// Invocation of parent class methods with child class objects
		
		ts.setEmpNr(194298);
		
		ts.setAge(21);
		
		ts.setFirstName("NIKHIL");
		
		ts.setLastname("BANSAL");
		
		ts.setPancardNr("AGNPY0538D");

		ts.setPassportNr("J57331456");
		
	    ts.calculateSalary(18.7f) ;

// Implementation of HAS-A relationship	    
	    
		ts.setF(f1);
		
// Invocation of child class methods with child class objects		
		
		ts.displayTempStaffDetails(ts) ;
		
		ts.displaySalary();
		
		ts.displayWorkHours();
		

	    

		}


}
