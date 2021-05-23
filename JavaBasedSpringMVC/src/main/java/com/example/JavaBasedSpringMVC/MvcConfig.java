package com.example.JavaBasedSpringMVC;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
@ComponentScan({"com.example.JavaBasedSpringMVC"})
public class MvcConfig extends WebMvcConfigurerAdapter {
}
