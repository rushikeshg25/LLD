package org.example;

import org.example.vehicle.Vehicle;

import java.util.HashMap;
import java.util.Map;

public class Level {
    private int levelNum;
    private int spots;
    private Map<Integer,Vehicle> spot;

    Level(int levelNum,int spots){
        this.levelNum=levelNum;
        this.spots=spots;
        this.spot=new HashMap<>(spots);
    }
}
