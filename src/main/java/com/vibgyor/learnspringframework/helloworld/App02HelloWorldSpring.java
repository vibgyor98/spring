package com.vibgyor.learnspringframework.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App02HelloWorldSpring {
    public static void main(String[] args) {
        //1. Lunch a Spring Context
        try(var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
            //2. Configure the things that we want spring to manage - @Configuration
            //3. Retrieving Beans managed by Spring
            System.out.println(context.getBean("name"));
            System.out.println(context.getBean("age"));
            System.out.println(context.getBean("person"));
            System.out.println(context.getBean("address"));

            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }
    }
}
