package com.vibgyor.learnspringframework;

import com.vibgyor.learnspringframework.game.GameRunner;
import com.vibgyor.learnspringframework.game.PacMan;

public class AppGamingBasicJava {
    public static void main(String[] args) {
//        var game = new MarioGame();
        var game = new PacMan(); //Object creation
//        var game = new SuperContraGame();
        var gameRunner = new GameRunner(game); //Wiring of dependencies, specific game is a dependency of game runner class
        gameRunner.run();
    }
}
