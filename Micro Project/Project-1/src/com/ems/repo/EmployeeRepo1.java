package com.ems.repo;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.ems.model.Employee;
import com.ems.util.DBUtil;

/**
 * @author Steven
 * @version 1.0 It is performing all the CRUD operations on Map DB.
 */

public class EmployeeRepo1 {

	/**
	 * @param employee
	 * @return boolean
	 * It is performing insert operation
	 */

	public boolean doInsert(Employee employee) {
		Map<Integer, Employee> map = DBUtil.getMapDBInstance();
		map.put(employee.getEid(), employee);
		return true;
	}

	/**
	 * @param id
	 * @return boolean
	 * It is performing delete operation
	 */
	public boolean doDelete(int id) {
		boolean flag = false;
		Map<Integer, Employee> map = DBUtil.getMapDBInstance();
		if (map.containsKey(id)) {
			flag = true;
		}
		return flag;
	}
	
/**
 * 
 * @param employee
 * @return boolean
 * It is performing update operation
 */
	public boolean doUpdate(Employee employee) {
		boolean flag = false;
		Map<Integer, Employee> map = DBUtil.getMapDBInstance();
		if (map.containsKey(employee.getEid())) {
			map.put(employee.getEid(), employee);
			flag = true;
		}

		return flag;
	}
/**
 * 
 * @param id
 * @return Employee
 * It is performing Find operation
 */
	public Employee doFind(int id) {
		Employee employee = null;
		Map<Integer, Employee> map = DBUtil.getMapDBInstance();
		if (map.containsKey(id)) {
			employee = map.get(id);
		}
		return employee;
	}
/**
 * @return list
 * It is performing Finding all operation
 */
	public List<Employee> doFindAll() {
		Map<Integer, Employee> map = DBUtil.getMapDBInstance();
		Collection<Employee> collection = map.values();
		List<Employee> list = new LinkedList<>();
		for (Employee e : collection) {
			list.add(e);
		}

		return list;

	}
}
