package com.edusol.bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
/*import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.edusol.bank.Foo;*/
import org.springframework.context.annotation.ComponentScan;

import com.fasterxml.jackson.databind.ObjectMapper;

@ComponentScan(basePackages="com.edusol.*")
@SpringBootApplication(exclude = HibernateJpaAutoConfiguration.class)
public class BankApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankApplication.class, args);
		
		
			
		/*
		 * ApplicationContext context = new
		 * ClassPathXmlApplicationContext("applicationContext.xml"); Bar bar =
		 * (Bar)context.getBean("bar", Bar.class); System.out.println(bar.getId());
		 * System.out.println(bar.getFooName());
		 * 
		 * Foo foo = (Foo)context.getBean("foo"); System.out.println(foo.getName());
		 */
		
		
	
	}

}
