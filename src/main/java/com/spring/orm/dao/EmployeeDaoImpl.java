package com.spring.orm.dao;

import java.io.Serializable;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.spring.orm.pojo.Employee;


public class EmployeeDaoImpl {
	
	HibernateTemplate hibernateTemplate;
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	@Autowired
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	
	
	@Transactional
	public int insert(Employee employee)
	{
		Serializable serializable = hibernateTemplate.save(employee);
		System.out.println((Integer)serializable+ " record inserted....");
		return (Integer)serializable;
	}
	
	public Employee getStudent(int id)
	{
		return hibernateTemplate.get(Employee.class, id);
	}
	
	public List<Employee> getAllStudents(){
		
		return hibernateTemplate.loadAll(Employee.class);
	}
	
	@Transactional
	public void deleteStudent(int id)
	{
		Employee employee = hibernateTemplate.get(Employee.class, id);
		hibernateTemplate.delete(employee);
	}
	
	@Transactional
	public void updateStudent(Employee employee) {
		hibernateTemplate.update(employee);
	}
}
