package no.tusla;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.oauth2.provider.error.OAuth2AccessDeniedHandler;
import org.springframework.boot.autoconfigure.security.SecurityProperties; 
@Configuration
@EnableWebSecurity
@Order(SecurityProperties.ACCESS_OVERRIDE_ORDER) 
public class WebSecurityConfigurer extends WebSecurityConfigurerAdapter
{
	@Override
	@Bean
	public AuthenticationManager authenticationManagerBean() throws Exception
	{
		return super.authenticationManagerBean();
	}
	@Override
	@Bean
	public UserDetailsService userDetailsServiceBean() throws Exception {
		return super.userDetailsServiceBean();
	}
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception 
	{
		auth.inMemoryAuthentication()
		.withUser("aniket")
		.password("aniket")
		.roles("USER")
		.and()
		.withUser("samrat")
		.password("samrat")
		.roles("USER")
		.and()
		.withUser("antima")
		.password("antima")
		.roles("USER")
		.and()
		.withUser("ashwini")
		.password("ashwini")
		.roles("USER")
		.and()
		.withUser("levent")
		.password("levent")
		.roles("USER")
		.and()
		.withUser("jonathan")
		.password("jonathan")
		.roles("USER")
		.and()
		.withUser("waqar")
		.password("waqar")
		.roles("USER")
		.and()
		.withUser("ravi")
		.password("ravi")
		.roles("USER")
		.and()
		.withUser("henrik")
		.password("henrik")
		.roles("USER", "ADMIN");
	}
	
	 
}
