package com.posidex.boot.configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {		
		//super.configure(http);
		/*
		//http.authorizeRequests((requests) -> requests.anyRequest().authenticated());
		http.authorizeHttpRequests()
			.anyRequest()
			.authenticated();
		
		http.formLogin();
		http.httpBasic();
		*/
		
	
		//-- customize the requirement -- sbi/home,sbi/customercare -- no need to have authentication
		http.authorizeRequests()
		    .antMatchers("/sbi/home","/sbi/customercare")
		    .permitAll()
			.antMatchers("/sbi/balance","/sbi/statement","/sbi/loan")
			.authenticated()			
			.and()
			.formLogin()			
			.and()
			.httpBasic();		
	}
	
}
