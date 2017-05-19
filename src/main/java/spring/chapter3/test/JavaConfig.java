package spring.chapter3.test;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;


@Configuration
@PropertySource("classpath:/spring.properties")
public class JavaConfig {
	
	@Autowired
	Environment env;
	
	@Bean
	@Conditional(BeanCreateCondition.class)
	@Profile({"test","dev"})
	public DataSource dataSource(){
		return new EmbeddedDatabaseBuilder().addScript("classpath:create-db.sql").addScript("classpath:test-data.sql").build();
	}
	
	@Bean
	@Conditional(BeanCreateCondition.class)
	@Profile("dev")
	public Person person(){
		return new Person(env.getProperty("name"),env.getProperty("age",int.class));
	}
}
