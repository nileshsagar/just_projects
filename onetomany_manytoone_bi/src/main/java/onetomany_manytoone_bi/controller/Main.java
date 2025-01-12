package onetomany_manytoone_bi.controller;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetomany_manytoone_bi.dto.BankAccount;
import onetomany_manytoone_bi.dto.Person;

public class Main {

	public static void main(String[] args) {
		
		Person person=new Person();
		person.setId(190);
		person.setName("nilesh");
		person.setPhone(8765434559l);
		person.setAddress("Satara");
		
		BankAccount ac1=new BankAccount();
		ac1.setId(6);
		ac1.setName("nilesh");
		ac1.setBalance(7659876.00);
		ac1.setIfsc("bnki123");
	
		
		BankAccount ac2=new BankAccount();
		ac2.setId(8);
		ac2.setName("nilesh");
		ac2.setBalance(7659876.00);
		ac2.setIfsc("bnki123");
		
		List<BankAccount> list=new ArrayList<BankAccount>();
		list.add(ac1);
		list.add(ac2);	
		
		person.setAc(list);	
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("latur");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		transaction.begin();
		manager.persist(person);
		manager.persist(ac1);
		manager.persist(ac2);
		transaction.commit();
		
		
	}
}
