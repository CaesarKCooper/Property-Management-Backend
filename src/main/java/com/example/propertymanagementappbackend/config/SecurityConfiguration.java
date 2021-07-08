package com.example.propertymanagementappbackend.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import com.auth0.spring.security.api.JwtWebSecurityConfigurer;

@EnableWebSecurity
@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
    @Value(value = "${auth0.apiAudience}")
    private String apiAudience;
    @Value(value = "${auth0.issuer}")
    private String issuer;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        JwtWebSecurityConfigurer
                .forRS256(apiAudience, issuer)
                .configure(http)
                .authorizeRequests()
                .antMatchers(HttpMethod.GET, "/api/studioefficiencies").permitAll()
                .antMatchers(HttpMethod.GET, "/api/studioefficiency/{id}").permitAll()
                .antMatchers(HttpMethod.GET, "/api/apartments").permitAll()
                .antMatchers(HttpMethod.GET, "/api/apartment/{id}").permitAll()
                .antMatchers(HttpMethod.GET, "/api/homes").permitAll()
                .antMatchers(HttpMethod.GET, "/api/home/{id}").permitAll()
                .antMatchers(HttpMethod.POST, "/api/studioefficiencies").permitAll()
                .antMatchers(HttpMethod.POST, "/api/apartments").permitAll()
                .antMatchers(HttpMethod.POST, "/api/homes").permitAll()
                .antMatchers(HttpMethod.POST, "/image/upload").permitAll()
                .antMatchers(HttpMethod.GET,"/image/get/{imageName}").permitAll()
                .antMatchers(HttpMethod.GET,"/image/upload/{imageFile}").permitAll()
                .antMatchers(HttpMethod.POST,"/api/inquiry").permitAll()
                .antMatchers(HttpMethod.GET,"/api/inquiry").permitAll()




                .anyRequest().authenticated();

                http.cors();
    }

}
