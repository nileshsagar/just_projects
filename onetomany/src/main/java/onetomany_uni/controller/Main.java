package onetomany_uni.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetomany_uni.dao.CompanyDao;
import onetomany_uni.dto.Company;
import onetomany_uni.dto.Employee;

public class Main {

	public static void main(String[] args) {
		
		Employee employee1=new Employee();
		employee1.setId(4);
		employee1.setName("Ganu");
		employee1.setAddress("Latur");
		employee1.setPhone(7654345677l);
		
		Employee employee2=new Employee();
		employee2.setId(5);
		employee2.setName("Adi");
		employee2.setAddress("Pune");
		employee2.setPhone(7654345677l);
		
		Employee employee3=new Employee();
		employee3.setId(6);
		employee3.setName("Shiva");
		employee3.setAddress("Nashik");
		employee3.setPhone(7654345677l);
		
		List<Employee> list=new ArrayList<Employee>();
		list.add(employee1);
		list.add(employee2);
		list.add(employee3);		
		
		Company company=new Company();
		company.setId(102);
		company.setName("Wipro");
		company.setLocation("Nagpur");
		company.setList(list);
		
		CompanyDao dao=new CompanyDao();
		dao.save(company);
		
		
		
	}  
}
