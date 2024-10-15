package com.snake.ladders.game;

import java.util.HashMap;
import java.util.Map;

public class SnakesAndLadders {
    Map<Integer,Integer>portals;

    SnakesAndLadders(){
        this.portals=new HashMap<>();
    }

    public void createPortal(int start,int end){
       portals.put(start,end);
    }

    public void removePortal(int start,int end){
        portals.remove(start);
    }
}
