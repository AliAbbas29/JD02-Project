package by.itacademy.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "by.itacademy.controller")
@Import(value = {Config.class, ServiceConfig.class, ThymeleafConfig.class, SecurityConfig.class})
public class WebConfig {
}
