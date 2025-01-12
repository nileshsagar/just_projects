package onetoone_uni.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetoone_uni.dto.AadharCard;
import onetoone_uni.dto.Person;
import onetoone_uni.dto.PersonDao;

public class Main {
	
	public static void main(String[] args) {
	
//	AadharCard aadharCard=new AadharCard();
//	   
//	  aadharCard.setId(2);
//	  aadharCard.setName("Vibhas");
//	  aadharCard.setAddress("Amravati");
//	  
//	  Person person=new Person();
//	  person.setId(102);
//	  person.setName("Vibhas");
//	  person.setPhone(9875432432l);
//	  person.setAddress("Pune");
//	  person.setAadharCard(aadharCard);	
//	 
	 PersonDao dao=new PersonDao();
////	 dao.savePerson(person);
//	 
//	 dao.getPerson(101);
		
		dao.deletePerson(102);
	  
	}
}
