package com.employee.management.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@Configuration
public class DataBaseConfiguration {
	
	@Value("${spring.jpa.properties.hibernate.dialect}")
	private String DIALECT;
	
	@Value("${spring.jpa.hibernate.show_sql}")
	private String SHOW_SQL;
	
	@Value("${spring.jpa.hibernate.ddl_auto}")
	private String HBM2DDL_AUTO;
	
	@Value("${entitymanager.packageToScan}")
	private String PACKAGE_TO_SCAN;
	
	
	@Bean
	@ConfigurationProperties(prefix="spring.datasource")
	public DataSource dataSource(){
		return DataSourceBuilder.create().build();
	}

	@Bean(name="entityManagerFactory")
	public LocalSessionFactoryBean sessionFactory(){
	   LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
	   sessionFactory.setDataSource(dataSource());
	   sessionFactory.setPackagesToScan(new String[]{PACKAGE_TO_SCAN});
	   sessionFactory.setHibernateProperties(hibernateProperties());
	   
		return sessionFactory;
	}
	
	public Properties hibernateProperties(){
		Properties hibernateProperties = new Properties();
		hibernateProperties.put("hibernate.dialect", DIALECT);
		hibernateProperties.put("hibernate.show_sql", SHOW_SQL);
		hibernateProperties.put("hibernate.hbm2ddl.auto", HBM2DDL_AUTO);
		return hibernateProperties;
	}
	
	@Bean
	public HibernateTransactionManager transactionManager(){
		HibernateTransactionManager transactionManager = new HibernateTransactionManager();
		transactionManager.setSessionFactory(sessionFactory().getObject());
		return transactionManager;
	}
	
	
}
