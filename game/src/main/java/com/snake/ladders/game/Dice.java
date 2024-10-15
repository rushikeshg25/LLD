package com.snake.ladders.game;

public class Dice {
    private int num;

    int roll(){
        return (int) (Math.random() * (6 * num)) + num;
    }
}
