package com.model.dao;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernate.connection.HibernateConnection;
import com.model.persistence.Employee;

public class EmployeeDao {

	Employee emp = new Employee();

	public String createEmployee(Employee emp) {
		emp.setEmpID(emp.getEmpID());
		emp.setEmpName(emp.getEmpName());
		emp.setdId(emp.getdId());
		SessionFactory sessionFactory = HibernateConnection.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(emp);
		String result = "Employee Record inserted";
		session.getTransaction().commit();
		session.close();
		return result;
	}

	public String updateEmployee(int dId, int empID, String empName) {
		emp.setEmpID(empID);
		emp.setEmpName(empName);
		emp.setdId(dId);
		SessionFactory sessionFactory = HibernateConnection.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.update(emp);
		String result = "Employee Record Updated";
		session.getTransaction().commit();
		session.close();
		return result;

	}

	public String deleteEmployee(int dId, int empID) {
		emp.setdId(dId);
		emp.setEmpID(empID);
		SessionFactory sessionFactory = HibernateConnection.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.delete(emp);
		String result = "Employee Record Deleted";
		session.getTransaction().commit();
		session.close();
		return result;
	}

	public List<Employee> getAllEmployees(int deptID) {
		Employee e1= new Employee();
		e1.setdId(deptID);
		SessionFactory sessionFactory = HibernateConnection.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		SQLQuery query= session.createSQLQuery("select * from Employee where DID=:deptid");
	    query.addEntity(Employee.class);
	    query.setParameter("deptid",deptID);
	    List Employee=query.list();
	    session.getTransaction().commit();
		session.close();
		return Employee;
	}}
