package com.Day2;

public class ThisKeyword {
	int eid;
	String ename;
	double esalary;

	// Constructor( Name should be same as class name)
	ThisKeyword(int eid, String ename, double esalary) {
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}

	ThisKeyword() {
		this(100, "mark", 1000);

	}

	// Main function
	void display() {
		System.out.println("Employee id:" + eid);
		System.out.println("Employee name:" + ename);
		System.out.println("Empployee salary:" + esalary);
	}


	public static void main(String[] args) {
		ThisKeyword mark = new ThisKeyword();
		mark.display();

	}

}
