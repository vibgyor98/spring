package com.vibgyor.learnspringframework.game;

public class SuperContraGame implements GamingConsole{
    public void up() {
        System.out.println("up");
    }
    public void down() {
        System.out.println("Sit Down");
    }public void right() {
        System.out.println("Shoot a bullet");
    }
    public void left() {
        System.out.println("Go Back");
    }
}
