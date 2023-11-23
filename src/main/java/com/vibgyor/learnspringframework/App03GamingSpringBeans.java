package com.vibgyor.learnspringframework;

import com.vibgyor.learnspringframework.game.GameRunner;
import com.vibgyor.learnspringframework.game.GamingConsole;
import com.vibgyor.learnspringframework.game.PacMan;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.annotation.Annotation;

public class App03GamingSpringBeans {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
        }
    }
}
