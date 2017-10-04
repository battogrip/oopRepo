package learnJava;

import java.io.*;

public class EmployeeTest {
	public static void main(String args[]) {
		/* Create two objects using constructor */
		Employee empOne = new Employee("Gino Cleofa");
		Employee empTwo = new Employee("Imo Kathlan");
		// Invoking methods for each object created
		empOne.empAge(46);
		empOne.empDesignation("Senior Software Engineer");
		empOne.empSalary(1000);
		empOne.printEmployee();
		empTwo.empAge(13);
		empTwo.empDesignation("Software Engineer");
		empTwo.empSalary(500);
		empTwo.printEmployee();
	}
}