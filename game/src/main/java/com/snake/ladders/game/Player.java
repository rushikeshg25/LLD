package com.snake.ladders.game;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class Player {
    private int id;
    private int position;

//    public int getPosition(){
//        return this.position;
//    }

    Player(int id){
        this.id=id;
        this.position=0;
    }
}
