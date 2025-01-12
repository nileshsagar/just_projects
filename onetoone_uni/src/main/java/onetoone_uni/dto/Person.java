package onetoone_uni.dto;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private long phone;
	private String address;

	@OneToOne(cascade =CascadeType.ALL)
//	@OneToOne(cascade = {CascadeType.PERSIST,CascadeType.REMOVE})
	
	//Cascade is using for good practice in OneTOOne & OneToMany
	
	private AadharCard aadharCard;

}
