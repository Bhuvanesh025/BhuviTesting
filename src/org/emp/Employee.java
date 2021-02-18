package org.emp;

public class Employee {
	public void empId() {
		System.out.println("Emp ID:001");
	}
	public void empName() {
		System.out.println("Emp Name: Bhuvanesh.E");
	}
	public void empDob() {
		System.out.println("Emp Dob: 8th March");
	}
	public void empPhone() {
		System.out.println("Emp Phone: 123456");
	}
	public void empEmail() {
		System.out.println("Emp Email: abc@gmail.com");
	}
	public void empAddress() {
		System.out.println("Emp Address: xyz,Indra nagar,Cbe-639586");
	}
	public static void main(String[] args) {
		Employee c =new Employee();
		c.empId();
		c.empName();
		c.empDob();
		c.empPhone();
		c.empEmail();
		c.empAddress();
	}
	
	
	
}
