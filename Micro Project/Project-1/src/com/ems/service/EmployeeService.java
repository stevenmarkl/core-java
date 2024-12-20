package com.ems.service;

import com.ems.model.Employee;
import com.ems.repo.EmployeeRepo;
import com.ems.repo.EmployeeRepo1;

public class EmployeeService {

	// EmployeeRepo employeeRepo = new EmployeeRepo();
	EmployeeRepo1 employeeRepo = new EmployeeRepo1();

	public String insertValidation(Employee employee) {
		String result;
		if (employee == null) {
			result = "Employee Object is Null";
		} else if (employee.getEid() == 0 || employee.getEname() == null || employee.getSalary() == 0) {
			result = "Invalid Employee data";
		} else {
			boolean flag = employeeRepo.doInsert(employee);
			if (flag) {
				result = "Employee Object Saved";

			} else {
				result = "Employee Object Now Saved";
			}
		}
		return result;

	}

	public String deleteValidation(int id) {
		String result = "";

		if (id == 0) {
			result = "Invalid Id";
		} else {
			boolean flag = employeeRepo.doDelete(id);
			if (flag) {
				result = "Employee Object Deleted";

			} else {
				result = "Emplyee Object not Found";
			}
		}
		return result;
	}

	public String updateValidation(Employee employee) {
		String result;
		if (employee == null) {
			result = "Employee Object is Null";
		} else if (employee.getEid() == 0 || employee.getEname() == null || employee.getSalary() == 0) {
			result = "Invalid Employee data";
		} else {
			boolean flag = employeeRepo.doUpdate(employee);
			if (flag) {
				result = "Employee Object Saved";

			} else {
				result = "Employee Object Now Saved";
			}
		}
		return result;
	}

	public String findValidation(int id) {
		String result = "";

		if (id == 0) {
			result = "Invalid Id";
		} else {
			Employee employee = employeeRepo.doFind(id);
			if (employee != null) {
				result = employee.toString();

			} else {
				result = "Emplyee Object not Found";
			}
		}
		return result;
	}

	public String findAllValidation() {
		return employeeRepo.doFindAll().toString();
	}
}
