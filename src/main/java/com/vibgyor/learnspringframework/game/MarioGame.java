package com.vibgyor.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
public class MarioGame implements GamingConsole{
    public void up() {
        System.out.println("Jump");
    }
    public void down() {
        System.out.println("Get into hole");
    }public void right() {
        System.out.println("Accelerate");
    }
    public void left() {
        System.out.println("Slow down!!!");
    }
}
