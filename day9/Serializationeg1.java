package com.day9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
	transient private int empId;//transient keyword for making it non serializable
	private String name;
	private double salary;

	public Employee(int empId, String name, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}

public class Serializationeg1 {

	public static void main(String[] args) throws Exception {
		//Serialization
		Employee obj = new Employee(101,"k",20000);
		FileOutputStream fout = new FileOutputStream("C:\\New folder12\\Serialization.txt");
		ObjectOutputStream objout = new ObjectOutputStream(fout);
		objout.writeObject(obj);
		objout.close();
		fout.close();
		System.out.println("Object Saved Into The File");
		
		
		//Deserialization
		FileInputStream fin = new FileInputStream("C:\\New folder12\\Serialization.txt");
		ObjectInputStream objin = new ObjectInputStream(fin);
		Employee obj1 = (Employee) objin.readObject();
		objin.close();
		fin.close();
		 
		System.out.println("Employee id :" + obj1.getEmpId());
		System.out.println("Employee Name :" + obj1.getName());
		System.out.println("Employee Salary :" + obj1.getSalary());
		

	}

}
