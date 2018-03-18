package by.itacademy.config;

import by.itacademy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private final UserService userService;

    @Autowired
    public SecurityConfig(UserService userService) {
        this.userService = userService;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                    .antMatchers("/search")
                        .authenticated()
                    .anyRequest()
                        .permitAll()
                .and()
                    .formLogin()
                        .loginPage("/login")
                .and()
                    .logout()
                        .logoutSuccessUrl("/")
                .and()
                    .userDetailsService(userService);
    }
}
