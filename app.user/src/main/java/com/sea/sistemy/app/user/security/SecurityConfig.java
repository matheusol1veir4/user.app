package com.sea.sistemy.app.user.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration  
@EnableWebSecurity  
public class SecurityConfig extends WebSecurityConfigurerAdapter {  

    @Override  
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {  
        // Configuração de usuários em memória (apenas para demonstração)  
        auth.inMemoryAuthentication()  
            .withUser("user").password("{noop}password").roles("USER")  
            .and()  
            .withUser("admin").password("{noop}password").roles("ADMIN");  
    }  

    @Override  
    protected void configure(HttpSecurity http) throws Exception {  
        http  
            .csrf().disable() // Desabilitar CSRF para simplificar (não recomendado para produção)  
            .authorizeRequests()  
                .antMatchers("/api/clientes").hasRole("USER")  
                .antMatchers("/api/clientes/**").hasRole("ADMIN")  
                .anyRequest().authenticated()  
                .and()  
            .httpBasic(); // Habilitar autenticação básica  
    }  
}
