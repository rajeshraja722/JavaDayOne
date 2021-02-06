package org1.emp;
//Q6
import org.client.Client;
import org.company.Company;
import org.project.Project;


public class Employee {
	public void empName() {
System.out.println("empName");
	}
	public static void main(String[] args) {
		Employee e=new Employee();
		e.empName();
		Project p=new Project();
		p.projectName();
		Client c=new org.client.Client();
		c.clientName();
		Company co=new Company();
		co.companyName();
		Project pr=new Project();
		pr.projectName();
		
	}
}
