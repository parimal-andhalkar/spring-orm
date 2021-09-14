package com.spring.orm.xml;

import java.util.Properties;

import org.hibernate.FlushMode;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import com.spring.orm.pojo.Employee;

//@Configuration
//@ComponentScan(basePackages = {"com.spring.orm.noxml.dao"})
public class OrmConfig {
/*

	@Bean
	public DriverManagerDataSource getDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setUsername("root");
		ds.setPassword("root");
		ds.setUrl("");
		// ds.setDriverClassName("");
		return ds;
	}

	@Bean
	public LocalSessionFactoryBean getLocalSessionFactoryBean() {

		LocalSessionFactoryBean localSessionFactoryBean = new LocalSessionFactoryBean();
		localSessionFactoryBean.setDataSource(getDataSource());

		Properties hibernateProperties = new Properties();
		hibernateProperties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL55Dialect");
		hibernateProperties.setProperty("hibernate.show", "true");
		hibernateProperties.setProperty("hibernate.hbm2ddl.auto", "create");

		localSessionFactoryBean.setHibernateProperties(hibernateProperties);
		localSessionFactoryBean.setAnnotatedClasses(Employee.class);
		return localSessionFactoryBean;
	}

	
	
	@Bean("hibernateTemplate")
	public HibernateTemplate getHibernateTemplate()
	{
		HibernateTemplate hibernateTemplate = new HibernateTemplate();
		
		hibernateTemplate.setSessionFactory(getLocalSessionFactoryBean().getObject());
		
		return hibernateTemplate;
	}

*/
}
