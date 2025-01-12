package onetoone_springs.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import onetoone_springs.dto.Employee;

@Component
public class EmployeeDao {

	@Autowired
	EntityManager manager;

	EntityTransaction transaction = manager.getTransaction();

	public void saveEmployee(Employee employee) {
		transaction.begin();
		manager.persist(employee);
		transaction.commit();

	}

}
