package com.example.springsecurity;

import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

public class SecurityConfig {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http
                .csrf(csrf -> csrf.disable())
                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .authorizeHttpRequests(authorizeHttpRequests -> authorizeHttpRequests
                        .requestMatchers("/users/login").permitAll()
                        .requestMatchers("/users/register").permitAll()
                        .requestMatchers("files/**").permitAll()
                        .requestMatchers(HttpMethod.POST, "books").hasAnyAuthority("ADMIN")
                        .requestMatchers(HttpMethod.PUT, "books").hasAnyAuthority("ADMIN")
                        .requestMatchers(HttpMethod.DELETE, "books").hasAnyAuthority("ADMIN")
                        .anyRequest().authenticated()
                ) .build();
    }
}
