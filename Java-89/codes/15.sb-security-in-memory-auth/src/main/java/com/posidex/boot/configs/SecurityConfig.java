package com.posidex.boot.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {		
		//-- customize the requirement -- home, customercare -- no need to have authentication
		http.authorizeRequests()
		    .antMatchers("/home","/customercare")
		    .permitAll()
			.antMatchers("/balance","/statement","/loan")
			.authenticated()			
			
			.and()
			.formLogin()
			
			.and()
			.httpBasic();		
	}
	/*
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
			.withUser("admin").password("admin@123").authorities("admin")
			.and()
			.withUser("sunil").password("sunil@123").authorities("manager")
			.and()
			.withUser("praveen").password("praveen@123").authorities("read")
			.and()
			.passwordEncoder(NoOpPasswordEncoder.getInstance());
	}
	*/
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
			.withUser("admin").password(getPasswordEncoder().encode("admin@123")).authorities("admin")
			.and()
			.withUser("sunil").password(getPasswordEncoder().encode("sunil@123")).authorities("manager")
			.and()
			.withUser("praveen").password(getPasswordEncoder().encode("praveen@123")).authorities("read")
			.and()
			.passwordEncoder(getPasswordEncoder());
	}	
	
	@Bean
	public BCryptPasswordEncoder getPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
