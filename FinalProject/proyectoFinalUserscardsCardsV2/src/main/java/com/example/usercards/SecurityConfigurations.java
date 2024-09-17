package com.example.usercards;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
public class SecurityConfigurations {

    // Configures the HTTP security for the application
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests((requests) -> requests
                .requestMatchers("/cards/**").hasRole("ADMIN") // Only users with the 'ADMIN' role can access '/cards/**'
                .requestMatchers("/users/view/**").hasRole("USER") // Only users with the 'USER' role can access '/users/view/**'
                .requestMatchers("/users/manage/**").hasRole("ADMIN") // Only users with the 'ADMIN' role can access '/users/manage/**'
                .anyRequest().authenticated() // Any other request requires the user to be authenticated
            )
            .httpBasic(withDefaults()) // Enables Basic Auth
            .formLogin(withDefaults()); // Enables form-based login

        return http.build();
    }

    // Creates an in-memory user details service with three users
    @Bean
    public UserDetailsService userDetailsService() {
        // Creates a user with the "USER" role
        UserDetails user = User.builder()
            .username("user")
            .password(passwordEncoder().encode("password"))
            .roles("USER")
            .build();

        // Creates a user with the "ADMIN" role
        UserDetails admin = User.builder()
            .username("admin")
            .password(passwordEncoder().encode("admin"))
            .roles("ADMIN")
            .build();

        // Creates a user with both "USER" and "ADMIN" roles
        UserDetails superuser = User.builder()
            .username("superuser")
            .password(passwordEncoder().encode("Anaya")) // Use the password encoder method
            .roles("USER", "ADMIN")
            .build();

        // Return the in-memory user details manager containing details
        return new InMemoryUserDetailsManager(user, admin, superuser);
    }

    // Provides a password encoder and returns it
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
