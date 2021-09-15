package com.revature.dao;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.models.Employee;
import com.revature.util.HibernateUtil;

/*
 * This class represents all of the CRUD operations for the Employee Table
 * 
 *
 * Session methods:
 * 
 * save() and persist() --------result in a SQL insert
 * update() and merge() --------result in a SQL update
 * saveOrUpdate() --------------result in a SQL insert OR update (depends)
 * get() and load() ------------result in a SQL select
 *  
 */
public class EmployeeDao {
	
	public int insert(Employee e) {
		
		Session ses = HibernateUtil.getSession();
		
		Transaction tx = ses.beginTransaction();
		
		int pk = (int) ses.save(e);
		
		tx.commit();
		
		return pk;
		
	}
	
	public boolean update(Employee e) {
		return false;
	}
	
	public boolean delete(Employee e) {
		return false;
	}
	
	public List<Employee> findAll() {
		
		Session ses = HibernateUtil.getSession();
		
		// This is HQL hibernate query language
		List<Employee> emps = ses.createQuery("from Employee", Employee.class).list();
		
		return emps;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
