package com.mphasis.griffin.configurations;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
@EnableAspectJAutoProxy
@EnableTransactionManagement
@ComponentScan(basePackages="com.mphasis.griffin.*")
public class AppConfig {
  
  @Bean
  public DriverManagerDataSource getDataSource() {
  	DriverManagerDataSource ds=new DriverManagerDataSource();
  	ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
  	ds.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
  	ds.setUsername("FRS");
  	ds.setPassword("1234");
  	return ds;
  	
  }
  @Bean
  public LocalSessionFactoryBean  getSessionFactory() {
  	LocalSessionFactoryBean sessionFactory=new LocalSessionFactoryBean();
  	sessionFactory.setDataSource(getDataSource());
  	sessionFactory.setPackagesToScan("com.mphasis.griffin.entities");
//  	sessionFactory.setAnnotatedClasses(Fuser.class);
//  	sessionFactory.setAnnotatedClasses(Car.class);
//  	sessionFactory.setAnnotatedClasses(Product.class );
//  	sessionFactory.setAnnotatedClasses(DepartmentMph.class );
//  	sessionFactory.setAnnotatedClasses(EmployeeMph.class );
  	Properties properties=new Properties();
  	properties.put("hibernate.dialect", "org.hibernate.dialect.OracleDialect");
  	properties.put("hibernate.hbm2ddl.auto", "update");
  	properties.put("hibernate.show_sql","true");
  	properties.put("hibernate.format_sql","true");
  	sessionFactory.setHibernateProperties(properties);
  	return sessionFactory;
  	
  	
  }
  @Bean
	public HibernateTransactionManager getHibernateTransactionManger(SessionFactory s) {
		HibernateTransactionManager hibernateTransactionManager=new HibernateTransactionManager();
		hibernateTransactionManager.setSessionFactory(s);
		return hibernateTransactionManager;
	
}
  @Bean
  public WebMvcConfigurer corsConfigure() {
	  return new WebMvcConfigurerAdapter() {
		  @Override
		  public void addCorsMappings(
				CorsRegistry registry)
		  {
			  registry.addMapping("/**").allowedMethods("HEAD","GET","POST","PUT","DELETE")
			  .allowedHeaders("Origin","X-Requested-With","Content-Type","Accept");
		  }
				  
		  
	};
  }
}
