package com.snake.ladders.game;
import java.util.ArrayList;
import java.util.List;

public class Game {
   private  Dice dice;
   private List<Player> players;
   private SnakesAndLadders snakesAndLadders;
   private Board board;

   Game(Board board,SnakesAndLadders snakesAndLadders,Dice dice,int playerNum){
       this.board=board;
       this.snakesAndLadders=snakesAndLadders;
       this.dice=dice;
       this.players=new ArrayList<>();
       for (int i = 0; i < playerNum; i++) {
           players.add(new Player(i));
       }
   }

   void startGame(){
    int currentPos=0;
    int rolledNum;
    int n=board.getN();
    while(currentPos!=n*n){
        for(int i=0;i<players.size();i++){
            currentPos=players.get(i).getPosition();
            if(currentPos==n*n+1)continue;
            rolledNum= dice.roll();
            if(currentPos+rolledNum<=n*n) {
                currentPos += rolledNum;
                if (snakesAndLadders.portals.containsKey(currentPos)) {
                    currentPos = snakesAndLadders.portals.get(currentPos);
                    players.get(i).setPosition(currentPos);
                }
            } else if (currentPos==n*n) {
                players.get(i).setPosition(n*n+1);
            }
        }
    }
   }




}
