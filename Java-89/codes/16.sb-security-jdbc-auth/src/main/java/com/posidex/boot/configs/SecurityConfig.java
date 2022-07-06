package com.posidex.boot.configs;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	@Autowired
	private DataSource dataSource;
	
	@Autowired
	private BCryptPasswordEncoder encoder;
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		    .antMatchers("/home","/customercare")
		    .permitAll()
			.antMatchers("/admin").hasAuthority("ADMIN")
			.antMatchers("/mgr").hasAnyAuthority("ADMIN","MANAGER")
			.antMatchers("/employee").hasAnyAuthority("ADMIN","MANAGER","EMPLOYEE")
			.antMatchers("/common").hasAuthority("*")
			.anyRequest()
			.authenticated()
			
			.and()
			.formLogin()
			
			.and()
			.httpBasic();		
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.jdbcAuthentication()
			.dataSource(dataSource)
			.usersByUsernameQuery("select user_name, user_pwd, user_enabled from user_dtls where user_name = ?")
			.authoritiesByUsernameQuery("select user_name, user_role from user_dtls where user_name = ?")
			//.passwordEncoder(getPasswordEncoder());
			.passwordEncoder(encoder);
	}	
	
	/*
	@Bean
	public BCryptPasswordEncoder getPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}
	*/
}
