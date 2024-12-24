package com.ems.view;

import java.util.Scanner;

import com.ems.model.Department;
import com.ems.model.Department;

public class DepartmentView {
	
		static Scanner sc = new Scanner(System.in);
		static int  dno;
		static String dname;
		
	/**
	 * It is performing to display the users menu
	 */
		

		/**
		 * Methods to get input and store department details 
		 * @return 
		 */
		public static Department insertDepartmentView() {
			System.out.println("Enter Department dno and dname ");
			dno = sc.nextInt();
			dname = sc.next();
			
			Department department = new Department();
			department.setDid(dno);
			return new Department(dno ,dname);

		}

		public static int deleteDepartmentView() {
			System.out.println("Enter Department no");
			return sc.nextInt();

		}

		public static Department updateDepartmentView() {
			System.out.println("Enter Department dno and dname ");
			
			dno = sc.nextInt();
			dname = sc.next();
			
			Department department = new Department();
			department.setDid(dno);
			return new Department(dno, dname);
		}

		public static int findDepartmentView() {
			System.out.println("Enter Department no");
			return sc.nextInt();

		}

}