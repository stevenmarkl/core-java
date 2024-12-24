package com.ems.service;

import com.ems.model.Employee;
import com.ems.repo.EmployeeRepo;


public class EmployeeService {

	EmployeeRepo employeeRepo = new EmployeeRepo();


	public String insertEmployeeValidation(Employee employee) {
		String result;
		if (employee == null) {
			return  "Employee Object is Null";
		} else if (employee.getEid() == 0 || employee.getEname() == null || employee.getEsalary() == 0 || employee.getDepartment().getDno() == 0){
			result = "Invalid Employee data";
		}
		else {
			boolean flag = employeeRepo.doInsertEmployee(employee);
			if (flag) {
				result = "Employee Object Saved";

			} else {
				result = "Employee Object Not Saved";
			}
		}
		return result;
	}
	
	

	
	public String deleteEmployeeValidation(int id) {
		String result = "";

		if (id == 0) {
			result = "Invalid Id";
		} else {
			boolean flag = employeeRepo.doDeleteEmployee(id);
			if (flag) {
				result = "Employee Object Deleted";

			} else {
				result = "Emplyee Object not Found";
			}
		}
		return result;
	}

		public String updateEmployeeValidation(Employee employee) {
		String result;
		if (employee == null) {
			result = "Employee Object is Null";
		} else if (employee.getEid() == 0 || employee.getEname() == null || employee.getEsalary() == 0) {
			result = "Invalid Employee data";
		} else {
			boolean flag = employeeRepo.doUpdateEmployee(employee);
			if (flag) {
				result = "Employee Object Saved";

			} else {
				result = "Employee Object Now Saved";
			}
		}
		return result;
	}

public String findEmployeeValidation(int id) {
		String result = "";

		if (id == 0) {
			result = "Invalid Id";
		} else {
			Employee employee = employeeRepo.doFindEmployee(id);
			if (employee != null) {
				result = employee.toString();

			} else {
				result = "Employee Object not Found";
			}
		}
		return result;
	}

	public String findAllEmployeeValidation() {
		return employeeRepo.doFindAll().toString();
	}
	
}
