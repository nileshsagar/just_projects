package onetoone_springs.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Entity
@Component
public class SalaryAccount {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Value("Kotak Mahidra") 
	private String name;
	@Value("KKBK0002044")
	private String ifsc;
	
	
}
