package com.vibgyor.learnspringframework;

import com.vibgyor.learnspringframework.game.GameRunner;
import com.vibgyor.learnspringframework.game.PacMan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.vibgyor.learnspringframework.game.GamingConsole;
@Configuration
public class GamingConfiguration {
    @Bean
    public GamingConsole game() {
        var game = new PacMan();
        return game;
    }
    @Bean
    public GameRunner gameRunner(GamingConsole game) {
        var gameRunner =  new GameRunner(game);
        return gameRunner;
    }
}
