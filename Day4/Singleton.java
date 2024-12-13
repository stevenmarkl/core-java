package com.Day4;

class Employee {
	static private Employee emp = null;
	
	private Employee() {
		
	}
	
	public static Employee getEmployee() {
		if (emp == null) {
			emp = new Employee();
		}
			else {
				emp = null;
		}
	return emp;
	}


public void display() {
	System.out.println("Employee");
}
}

public class Singleton {

	public static void main(String[] args) {
		Employee emp = Employee.getEmployee();
		emp.display();
		
	}
	}


