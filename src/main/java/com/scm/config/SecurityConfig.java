package com.scm.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.scm.services.impl.SecurityCustomUserDetailService;

@Configuration
public class SecurityConfig {

     @Autowired
    private SecurityCustomUserDetailService userDetailService; 
    // TODO user create using java code with in memory service
    // user create and login using java code with in memory service

    // @Bean
    // public UserDetailsService userDetailsService() {
    //     /*
    //      *  UserDetails user= User
    //    .withDefaultPasswordEncoder()
    //    .username("admin")
    //      */
    //    UserDetails user= User
    //    .withDefaultPasswordEncoder()
    //    .username("admin")
    //    .password("@dmin")
    //    .roles("ADMIN","USER")
    //    .build();
    //     var inMemoryUserDetailsManager = new InMemoryUserDetailsManager(user);
    //     return inMemoryUserDetailsManager;

    // }

    @Bean
    public AuthenticationProvider authenticationProvider(){
        DaoAuthenticationProvider daoAuthenticationProvider=new DaoAuthenticationProvider();
        //user Detail service 
        daoAuthenticationProvider.setUserDetailsService(userDetailService);
        //password encodder object
        daoAuthenticationProvider.setPasswordEncoder(passwordEncoder());
        return daoAuthenticationProvider;
    }


     @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {

        // configuration

        // urls configure kiay hai ki koun se public rangenge aur koun se private
        // rangenge
        httpSecurity.authorizeHttpRequests(authorize -> {
            // authorize.requestMatchers("/home", "/register", "/services").permitAll();
            authorize.requestMatchers("/user/**").authenticated();
            authorize.anyRequest().permitAll();
        });

        // form default login
        // agar hame kuch bhi change karna hua to hama yaha ayenge: form login se
        // related
        httpSecurity.formLogin(Customizer.withDefaults());

        return httpSecurity.build();

    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
