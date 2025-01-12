package onetoone_uni.dto;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.transaction.Transaction;

public class PersonDao {

	public EntityManager getEntityManager() {
		
		return Persistence.createEntityManagerFactory("latur").createEntityManager();
		
}
	
	public void savePerson(Person person) {
		
		EntityManager manager=getEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
//		manager.persist(person.getAadharCard());
		manager.persist(person);
		transaction.commit();
		
	}
	
	public void getPerson(int id) {
		EntityManager manager=getEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		   Person person= manager.find(Person.class,id);
		
		if (person!=null) {
			
			System.out.println(person);
			
		} else {

			System.out.println("not a  person");
		}
		
		
		
	}
	public void deletePerson(int id) {
		EntityManager manager=getEntityManager();
		
		
	 Person person = manager.find(Person.class,id);
	 
	 if (person!=null) {
		
		 EntityTransaction transaction=manager.getTransaction();
		 transaction.begin();
//		 manager.remove(person.getAadharCard());
		 manager.remove(person);
		 transaction.commit();
		 
	} else {
       System.out.println("person not");
	}
	
	}
	
	public void updatePerson(int id,Person person) {
		
		EntityManager manager=getEntityManager();
		Person person2=manager.find(Person.class, id);
		
		if (person2!=null) {
			
			EntityTransaction transaction=manager.getTransaction();
			person.setId(id);
			person.setAadharCard(person.getAadharCard());
			
			transaction.begin();
			manager.merge(person);
			transaction.commit();
			
		} else {
			
			System.out.println("not found");

		}
		
		
		
	}
}
