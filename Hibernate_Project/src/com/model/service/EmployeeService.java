package com.model.service;

import java.util.List;

import com.model.dao.EmployeeDao;
import com.model.persistence.Employee;

public class EmployeeService {

	public static String createEmployee(Employee emp) {
		return new EmployeeDao().createEmployee(emp);
	}

	public static String updateEmployee(int dId, int empID, String empName) {
		return new EmployeeDao().updateEmployee(dId, empID, empName);
	}

	public static String deleteEmployee(int dId, int empID) {
		return new EmployeeDao().deleteEmployee(dId, empID);
	}

	public static List<Employee> getAllEmployees(int deptID) {
		return new EmployeeDao().getAllEmployees(deptID);
	}
}
