package com.vibgyor.learnspringframework;

import com.vibgyor.learnspringframework.game.GameRunner;
import com.vibgyor.learnspringframework.game.MarioGame;
import com.vibgyor.learnspringframework.game.SuperContraGame;

public class AppGammingBasicJava {
    public static void main(String[] args) {
//        var marioGame = new MarioGame();
        var superContraGame = new SuperContraGame();
        var gameRunner = new GameRunner(superContraGame);
        gameRunner.run();
    }
}
