/**
 * TempStaff.java 
 * version  1.1
 * compiled on 6th August 2017
 */
package session4assign42;
/**
 * 
 * This class will illustrate the IS-A relationship with the help of parent class CompanyStaff.java
 * 
 * @author Chhaya Yadav
 *
 */
public class TempStaff extends CompanyStaff{
	
//Instance Vaariable Declaration	
	
	private float hourlyrate ;
	
	public float salary ;
	
	public float workHrs ;
	
	
//Default Constructor Declaration	
public TempStaff(){

    hourlyrate = 0.75f ;
    }

//Method to calculate Salary

public void calculateSalary(float workHrs){
	
	this.workHrs = workHrs ;

	this.salary = hourlyrate * workHrs ;
    }

//Method to display the TempStaff salary

public void displaySalary(){
	
	System.out.println("TEMPORARY STAFF TOTAL SALARY :$"+ this.salary );
    }

//Method to display the working hours

public void displayWorkHours(){
	
	System.out.println("TEMPORARY STAFF TOTAL WORKING HOURS :"+ this.workHrs);
    }
}


