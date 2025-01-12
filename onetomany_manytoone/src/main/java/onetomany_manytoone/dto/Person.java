package onetomany_manytoone.dto;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Person {

	private int id;
	private String name;
	private long phn;
	@ManyToOne
	private Company company;
}
