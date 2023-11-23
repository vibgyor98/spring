package com.vibgyor.learnspringframework.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age){};
record Address (String firstLine, String city){};
@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name() {
        return "Vibgyor";
    }
    @Bean
    public int age() {
        return 26;
    }
    @Bean
    public Person person() {
        return new Person("Ravi", 30);
    }
    @Bean
    public Address address() {
        return new Address("Barabati", "Balasore");
    }
}
