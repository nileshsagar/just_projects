package onetoone_uni.controller;

import onetoone_uni.dto.AadharCard;
import onetoone_uni.dto.Person;
import onetoone_uni.dto.PersonDao;

public class CastExample {

	public static void main(String[] args) {
//		
		
		//For PERSIST
		
		
//		AadharCard card=new  AadharCard();
//		card.setId(112);
//		card.setName("nilesh");
//		card.setAddress("latur");;
// 
//		Person person=new Person();
//		person.setId(112);
//		person.setName("nilesh");
//		person.setPhone(8765487656l);
//		person.setAddress("latur");
//		person.setAadharCard(card);
//		
      	PersonDao dao=new PersonDao();
//		dao.savePerson(person);		
//		
		//FOR DELETE
		
		dao.deletePerson(112);
		
		AadharCard aadharCard=new AadharCard();
		aadharCard.setId(111);
		aadharCard.setName("ganesh");
		aadharCard.setAddress("pune");
		
		Person person=new Person();
		person.setId(111);
		person.setName("ganesh");
		person.setPhone(7654345678l);
		person.setAddress("pune");
		person.setAadharCard(aadharCard);
		
		dao.updatePerson(111, person);
		
	}
}
