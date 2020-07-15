package com.model.hibernateMain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.model.persistence.Department;
import com.model.persistence.Employee;
import com.model.service.EmployeeService;

public class MainTest {

	public static void main(String[] args) {
		int deptID;
		String deptName;
		Department d = new Department();
		Scanner sc = new Scanner(System.in);
		// creating Table
		/*
		 * System.out.println("Enter the deptID:");
		 * d.setDeptID(Integer.parseInt(sc.nextLine()));
		 * System.out.println("Enter the deptName :");
		 * d.setDeptName(sc.nextLine());
		 * System.out.println(DepartmentService.createDepartment(d));
		 */
		
		// Update the Department
		
		/*
		 * System.out.println("Enter deptName :"); deptName = sc.nextLine();
		 * System.out.println("Enter deptID :"); deptID =
		 * Integer.parseInt(sc.nextLine());
		 * System.out.println(DepartmentService.updateDepartment(deptName,
		 * deptID));
		 */
		
		// Getting all the Department Records

		// System.out.println(DepartmentService.getAllDepartments());

		// Delete the Department
		/*
		 * System.out.println("Enter DeptID :"); deptID =
		 * Integer.parseInt(sc.nextLine());
		 * System.out.println(DepartmentService.deleteDepartment(deptID));
		 */
		// Creating the Employee
		int empID;
		String empName;
		/*
		 * Employee e = new Employee();
		 * System.out.println("Enter the deptID of Employee:");
		 * e.setdId(Integer.parseInt(sc.nextLine()));
		 * System.out.println("Enter the empID:");
		 * e.setEmpID(Integer.parseInt(sc.nextLine()));
		 * System.out.println("Enter the empName"); e.setEmpName(sc.nextLine());
		 * System.out.println(EmployeeService.createEmployee(e));
		 */

		// update the Employee
		/*
		 * System.out.println("Enter the deptID of Employee to update:"); dId =
		 * Integer.parseInt(sc.nextLine());
		 * 
		 * System.out.println("Enter the empID:"); empID =
		 * Integer.parseInt(sc.nextLine());
		 * 
		 * System.out.println("Enter the empName:"); empName = sc.nextLine();
		 * System.out.println(EmployeeService.updateEmployee(dId, empID,
		 * empName));
		 */
		// Enter the deptId to get all employee details under the department

		System.out.println("Enter DepartmentID: ");
		deptID = Integer.parseInt(sc.nextLine());
		List<Employee> list = new ArrayList<Employee>();
		list = EmployeeService.getAllEmployees(deptID);
		for (Employee employee : list) {
			if (employee != null) {
				System.out.println(employee.getEmpID());
				System.out.println(employee.getEmpName());
			} else {
				System.out.println("Employee Not Found");
			}
		}
		/*
		 * System.out.println("Enter DID:"); dId = (sc.nextInt());
		 * System.out.println("Enter EmpID"); int empID1 = sc.nextInt();
		 * System.out.println(EmployeeService.deleteEmployee(dId, empID1));
		 */
	}
}