package com.ems.service;

import com.ems.model.Department;
import com.ems.model.Department;
import com.ems.repo.DepartmentRepo;
import com.ems.repo.DepartmentRepo;


public class DepartmentService {

	static DepartmentRepo departmentRepo = new DepartmentRepo();


	public String insertDepartmentValidation(Department department) {
		String result;
		if (department == null) {
			return  "department Object is Null";
		} else if (department.getDid() == 0 || department.getDname()== null) { 
			result = "Invalid Department data";
		}
		else {
			boolean flag = departmentRepo.doInsertDepartment(department);
			if (flag) {
				result = "Department Object Saved";

			} else {
				result = "Department Object Not Saved";
			}
		}
		return result;
	}
	
	

	
	public String deleteDepartmentValidation(int id) {
		String result = "";

		if (id == 0) {
			result = "Invalid Id";
		} else {
			boolean flag = departmentRepo.doDeleteDepartment(id);
			if (flag) {
				result = "Department Object Deleted";

			} else {
				result = "Emplyee Object not Found";
			}
		}
		return result;
	}

		public String updateDepartmentValidation(Department department) {
		String result;
		if (department == null) {
			result = "Department Object is Null";
		} else if (department.getDid() == 0 || department.getDname() ==  null) {
			result = "Invalid Department data";
		} else {
			boolean flag = departmentRepo.doUpdateDepartment(department);
			if (flag) {
				result = "Department Object Saved";

			} else {
				result = "Department Object Now Saved";
			}
		}
		return result;
	}

public static String findDepartmentValidation(int id) {
		String result = "";

		if (id == 0) {
			result = "Invalid Id";
		} else {
			Department department = departmentRepo.doFindDepartment(id);
			if (department != null) {
				result = department.toString();

			} else {
				result = "Department Object not Found";
			}
		}
		return result;
	}

	public String findAllDepartmentValidation() {
		return departmentRepo.doFindAll().toString();
	}
	
}
