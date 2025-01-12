package onetoone_springs.dto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public EntityManagerFactory entityManagerFactory() {
        return (EntityManagerFactory) Persistence.createEntityManagerFactory("latur").createEntityManager();
    }
    
  
}
