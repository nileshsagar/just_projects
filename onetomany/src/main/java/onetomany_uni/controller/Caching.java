package onetomany_uni.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import onetomany_uni.dto.Company;

public class Caching {

	public static void main(String[] args) {
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("nilesh");
		
		EntityManager manager=factory.createEntityManager();
		manager.find(Company.class,102);
		manager.find(Company.class,102);
		manager.find(Company.class,102);
		
		EntityManager manager2=factory.createEntityManager();
		manager2.find(Company.class, 102);
		
		EntityManager manager3=factory.createEntityManager();
		manager3.find(Company.class, 102);
		
		
	}
}
