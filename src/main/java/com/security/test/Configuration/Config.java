package com.security.test.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class Config {




    @Bean
    PasswordEncoder encoder(){
        return NoOpPasswordEncoder.getInstance();
    }


    @Bean
    SecurityFilterChain chain (HttpSecurity http  ) throws Exception{
        chooseHttpBasic(http);
//        authorizeRequest(http);
        return http.build();
    }

    public static void chooseHttpBasic(HttpSecurity http ) throws Exception {
            http.authe;
    }
    public static void authorizeRequest(HttpSecurity http ) throws Exception {
        http.authorizeHttpRequests((r)->
                r.requestMatchers("/hello").hasRole("admin")
                        .anyRequest().authenticated()
                );
    }
    
}
