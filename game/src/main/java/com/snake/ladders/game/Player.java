package com.snake.ladders.game;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class Player {
    private Long id;
    private String name;

    Player(String name,Long id){
        this.id=id;
        this.name=name;
    }
}
