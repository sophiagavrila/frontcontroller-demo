package com.revature.service;

import java.util.Optional;

import com.revature.dao.EmployeeDao;
import com.revature.models.Employee;

public class EmployeeService {

	private EmployeeDao edao;

	// Introduce Dependency Injection via Constructor injection
	public EmployeeService(EmployeeDao dao) {
		super();
		this.edao = dao;
	}

	// method: confirmLogin -> let's call the findAll() method from the DAO, and use
	// a stream, to confirm usernm + password
	public Employee confirmLogin(String username, String password) {
		
		// java.util
		Optional<Employee> emp = edao.findAll() // when I call stream()
				.stream()
				.filter(e -> (e.getUsername().equals(username) && e.getPassword().equals(password)))
				.findFirst(); // FindAny() is another option
		
		return (emp.isPresent() ? emp.get() : null);
		
		// in our web layer we can check IF null returned back
		
	}

	public int insert(Employee e) {

		return edao.insert(e);

	}

	public boolean update(Employee e) {

		return edao.update(e);

	}

	public boolean delete(Employee e) {

		return edao.delete(e);

	}

}
