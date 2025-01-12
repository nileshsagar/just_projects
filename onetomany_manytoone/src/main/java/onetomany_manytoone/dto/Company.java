package onetomany_manytoone.dto;

import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class Company {

	private int id;
	private String name;
	
	
	
}
