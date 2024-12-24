package com.ems.view;

import java.util.Scanner;

import com.ems.model.Department;
import com.ems.model.Employee;

public class EmployeeView {
	
		static Scanner sc = new Scanner(System.in);
		static int eid, esalary, dno;
		static String ename;
		
	/**
	 * It is performing to display the users menu
	 */
		

		/**
		 * Methods to get input and store employee details 
		 * @return 
		 */
		public static Employee insertEmployeeView() {
			System.out.println("Enter Employee id, name, salary and dno ");
			eid = sc.nextInt();
			ename = sc.next();
			esalary = sc.nextInt();
			dno = sc.nextInt();
			
			Department department = new Department();
			department.setDno(dno);
			return new Employee(eid,ename,esalary,department);

		}

		public static int deleteEmployeeView() {
			System.out.println("Enter Employee id");
			return sc.nextInt();

		}

		public static Employee updateEmployeeView() {
			System.out.println("Enter Employee id, name, salary and dno to update employee ");
			eid = sc.nextInt();
			ename = sc.next();
			esalary = sc.nextInt();
			dno = sc.nextInt();
			
			Department department = new Department();
			department.setDno(dno);
			return new Employee(eid,ename,esalary,department);
		}

		public static int findEmployeeView() {
			System.out.println("Enter Employee id");
			return sc.nextInt();

		}

}