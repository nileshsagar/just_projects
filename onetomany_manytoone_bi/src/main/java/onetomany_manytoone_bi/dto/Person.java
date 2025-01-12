package onetomany_manytoone_bi.dto;

import java.util.List;

import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


import lombok.Data;

@Entity
@Data
public class Person {

	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String name;
	long phone;
	String address;
	
	@OneToMany
	List<BankAccount> ac;
	
	
}
