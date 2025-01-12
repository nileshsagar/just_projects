package onetomany_uni.dao;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetomany_uni.dto.Company;
import onetomany_uni.dto.Employee;


public class CompanyDao {

	EntityManagerFactory factory=Persistence.createEntityManagerFactory("nilesh");
	EntityManager manager=factory.createEntityManager();
	EntityTransaction transaction=manager.getTransaction();
	
	public void save(Company company) {
	
		
		List<Employee> list=company.getList();
		
		transaction.begin();
		for (Employee employee : list) {
			
			manager.persist(employee);
			
		}
		manager.persist(company);
		
		transaction.commit();
	}
	
	public void find(Company company) {
		 
		
			List<Employee> list=company.getList();
			
			transaction.begin();
			
			for (Employee employee : list) {
				 
				manager.find(Company.class, list);
				
			}
			manager.remove(company);
			
		} 
		
		
	
	
	public void deleteCompany(int id) {
		
		Company company=manager.find(Company.class, id);
		if (company!=null) {
			List<Employee> list=company.getList();
			transaction.begin();
			for (Employee employee : list) {
				 
				manager.remove(employee);
				
			}
			manager.remove(company);
			
		} else {

			System.out.println("not ");
		}
		
	}
	
	
	
}
