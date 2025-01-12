package onetoone_springs.dto;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;


@Entity
@Component
@Data
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Value("Nilesh Sagar")
	private String name;
	@Value("8765436782")
	private long phone;
	@Value("Latur")
	private String address;
	@OneToOne(cascade = CascadeType.ALL)
	@Autowired
	private SalaryAccount account;
	
}
