/*
 * package com.employee.management.config;
 * 
 * import org.springframework.context.annotation.Bean; import
 * org.springframework.context.annotation.Configuration; import
 * org.springframework.security.config.annotation.web.builders.HttpSecurity;
 * import org.springframework.security.config.annotation.web.configuration.
 * WebSecurityConfigurerAdapter; import
 * org.springframework.web.servlet.ViewResolver; import
 * org.springframework.web.servlet.view.InternalResourceViewResolver;
 * 
 * @Configuration public class SecurityConfiguration extends
 * WebSecurityConfigurerAdapter {
 * 
 * @Override protected void configure(HttpSecurity security) throws Exception {
 * // security.httpBasic().disable(); //
 * security.authorizeRequests().antMatchers("/login").permitAll(); }
 * 
 * @Bean public ViewResolver jspViewResolver() { InternalResourceViewResolver
 * viewResolver = new InternalResourceViewResolver();
 * viewResolver.setPrefix("/WEB-INF/views/jsp/");
 * viewResolver.setSuffix(".jsp"); return viewResolver; }
 * 
 * }
 */