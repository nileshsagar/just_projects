package onetoone_springs.controller;

import java.io.ObjectInputFilter.Config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import onetoone_springs.dao.EmployeeDao;
import onetoone_springs.dto.Employee;

public class EmployeeController {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
	    EmployeeDao  dao = (EmployeeDao) context.getBean("employeeDao");
	   Employee employee =(Employee) context.getBean("employee");
	    dao.saveEmployee(employee);
	}
}

