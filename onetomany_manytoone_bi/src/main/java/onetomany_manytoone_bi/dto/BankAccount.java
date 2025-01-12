package onetomany_manytoone_bi.dto;

import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class BankAccount {

	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	String name;
	String ifsc;
	double balance;
	
	@ManyToOne
	Person person;
}
