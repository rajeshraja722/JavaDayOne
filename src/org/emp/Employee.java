
//Q1
package org.emp;

public class Employee {

	private void empId() {
		System.out.println("empid is:1001");

	}

	private void empName() {
		System.out.println("empName is: rajesh");
	}
	private void empDob() {
		System.out.println("empDob is: 1/2/2222");
	
	}
	private void empPhone() {
		System.out.println("emp phone :00099988999");
	
	}
	private void empEmail() {
		System.out.println("empEmail is:rajeshraja722@gmail.com");
	}
	
	private void empAddress() {
		System.out.println("empAddress is : chennai");
	}

public static void main(String[] args) {
	Employee e=new Employee();
	e.empId();
	e.empName();
	e.empPhone();
	e.empDob();
	e.empEmail();
	e.empAddress();
}
}



