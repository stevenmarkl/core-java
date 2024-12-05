package com.Day2;

class Employee{
 int eid;
 String ename;
 double esalary;
 
//Constructor( Name should be same as class name)
 Employee(int eid, String ename, double esalary ){
	 this.eid = eid;
	 this.ename = ename;
	 this.esalary = esalary;
 }


//Main function
void display()
{
System.out.println("Employee id:" +eid);
System.out.println("Employee name:"+ ename);
System.out.println("Empployee salary:"+ esalary);
}
}

public class ClassandObject {

	public static void main(String[] args) {
		Employee mark = new Employee(10,"mark",1000);
		mark.display();

		
		Employee partha = new Employee(20,"partha",2000);
		partha.display();
	}

}
