package com.vibgyor.learnspringframework;

import com.vibgyor.learnspringframework.game.GameRunner;
import com.vibgyor.learnspringframework.game.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.vibgyor.learnspringframework.game")
public class GamingAppLauncherApplication {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class)) {
            context.getBean(GamingConsole.class).up();
            context.getBean(GamingConsole.class).down();
            context.getBean(GameRunner.class).run();
        }
    }
}
