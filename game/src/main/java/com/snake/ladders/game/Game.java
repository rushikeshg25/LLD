package com.snake.ladders.game;
import java.util.ArrayList;
import java.util.List;

public class Game {
   private  Dice dice;
   private List<Player> players;
   private SnakesAndLadders snakesAndLadders;
   private Board board;
   private int currentIndex;

   Game(Board board,SnakesAndLadders snakesAndLadders,Dice dice,int players){
       this.board=board;
       this.snakesAndLadders=snakesAndLadders;
       this.dice=dice;
       this.players=new ArrayList<>();
       this.currentIndex=0;
   }



}
