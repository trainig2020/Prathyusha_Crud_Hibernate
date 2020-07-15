package com.model.service;

import java.util.List;

import com.model.dao.DepartmentDao;
import com.model.persistence.Department;

public class DepartmentService {

	public static String createDepartment(Department dept) {
		return new DepartmentDao().createDepartment(dept);
	}

	public static String updateDepartment(String deptName, int deptID) {
		return new DepartmentDao().updateDepartment(deptName, deptID);
	}

	public static String deleteDepartment(int deptID) {
		return new DepartmentDao().deleteDepartment(deptID);
	}

	public static String getAllDepartments() {
		return new DepartmentDao().getAllDepartments();
	}
}