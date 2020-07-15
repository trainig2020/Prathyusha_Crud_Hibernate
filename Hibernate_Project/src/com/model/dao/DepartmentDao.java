package com.model.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernate.connection.HibernateConnection;
import com.model.persistence.Department;

public class DepartmentDao {
	Department d = new Department();
	SessionFactory sessionFactory = HibernateConnection.getSessionFactory();

	public String createDepartment(Department dept) {
		d.setDeptID(dept.getDeptID());
		d.setDeptName(dept.getDeptName());
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(d);
		String result = "Elements were inserted";
		session.getTransaction().commit();
		session.close();
		return result;
	}

	public String updateDepartment(String deptName, int deptID) {
		d.setDeptID(deptID);
		d.setDeptName(deptName);
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.update(d);
		String result = "Elements were Updated";
		session.getTransaction().commit();
		session.close();
		return result;
	}

	public String deleteDepartment(int deptID) {
		d.setDeptID(deptID);
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.delete(d);
		String result = "Element is deleted";
		session.getTransaction().commit();
		session.close();
		return result;
	}

	public String getAllDepartments() {
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		Query query = session.createQuery("from Department");
		List Department = query.list();
		for (Object object : Department) {
			System.out.println(object.toString());
		}
		String Result = "All Department Details Are:";
		session.getTransaction().commit();
		session.close();
		return Result;
	}

}
