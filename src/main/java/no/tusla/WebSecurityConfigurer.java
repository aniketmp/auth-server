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
//@Order(SecurityProperties.ACCESS_OVERRIDE_ORDER) //Only in case of authorization_code grant type, this needs to be commented.
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
    public void configure(HttpSecurity http) throws Exception {
        http
        .csrf().disable()        
        .authorizeRequests()
        .and()
        .formLogin()
        .permitAll().and().logout().permitAll();
    }
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception 
	{
		auth.inMemoryAuthentication()
		.withUser("aniket")
		.password("aniket")
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
		.withUser("henrik")
		.password("henrik")
		.roles("USER", "ADMIN");
	}
	
	 
}
