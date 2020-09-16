package org.emp;

public class Employee {
	
	public void empId() {
		System.out.println("12345");
		}
	
	public void empName() {
		System.out.println("Vidhya");
	}
	
	public void empDOB() {
		System.out.println("April -17");		
	}
	
	public void empPhone() {
		System.out.println("1234454567");
		}
	
	public void empEmail() {
		System.out.println("test@gmail.com");
		}
	
	public void empAddress() {
		System.out.println("OMR road");
		}	
	
	public static void main(String[] args) {
		Employee e=new Employee();
		e.empId();
		e.empName();
		e.empDOB();
		e.empPhone();		
		e.empEmail();
		e.empAddress();
	}

}
