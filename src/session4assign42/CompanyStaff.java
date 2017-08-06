/**
 * ComapnyStaff.java 
 * version  1.1
 * compiled on 6th August 2017
 */
package session4assign42;
/**
 * 
 * This class will depict the parent class CompanyStaff.java
 * 
 * @author Chhaya Yadav
 *
 */
public class CompanyStaff {
	
//Instance Variable Declaration	
	
	public Family f ;
	
	private int EmpNr ;
	
	private String FirstName ;
		
	private String Lastname ;
	
	private String PancardNr ;
	
	private String PassportNr ;
	
	private int age ;
	
//Declaration of GET-SET Methods
	
public Family getF() {
		return f;
	}

public void setF(Family f) {
		this.f = f;
	}

public int getEmpNr() {
		return EmpNr;
	}

public void setEmpNr(int empNr) {
		EmpNr = empNr;
	}

public String getFirstName() {
		return FirstName;
	}

public void setFirstName(String firstName) {
		FirstName = firstName;
	}

public String getLastname() {
		return Lastname;
	}

public void setLastname(String lastname) {
		Lastname = lastname;
	}

public String getPancardNr() {
		return PancardNr;
	}

public void setPancardNr(String pancardNr) {
		PancardNr = pancardNr;
	}

public String getPassportNr() {
		return PassportNr;
	}

public void setPassportNr(String passportNr) {
		PassportNr = passportNr;
	}

public int getAge() {
		return age;
	}

public void setAge(int age) {
		this.age = age;
	}
	
// display of COMPANY STAFF Object details

public void displayTempStaffDetails(CompanyStaff t){
		
		System.out.println("*********EMPLOYEE is a Temporary Staff *********** ");
		
		System.out.println("EMP NAME       :"+t.getEmpNr());
			
		System.out.println("EMP FIRST NAME :"+t.getFirstName());
		
		System.out.println("EMP LASTNAME   :"+t.getLastname());
		
		System.out.println("EMP AGE        :"+t.getAge());
		
		System.out.println("EMP PANCARD NR :"+t.getPancardNr());

		System.out.println("EMP PASSPORT NR:"+t.getPassportNr());
		
		System.out.println("*********EMPLOYEE has a FAMILY *********** ");
		
		System.out.println(t.getF());
		
		System.out.println("****************************************** ");
	}
	

}