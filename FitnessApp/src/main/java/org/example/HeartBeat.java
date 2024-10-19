package org.example;
import java.util.Stack;

class Pair{
    int time;
    int heartBeat;
    Pair(int time,int heartBeat){
        this.time=time;
        this.heartBeat=heartBeat;
    }
}

public class HeartBeat {
    private User user;
    private Stack<Pair> heartBeatLog;

    HeartBeat(User user){
        this.user=user;
        this.heartBeatLog=new Stack<>();
    }

    public int getHeartbeat() {
        return this.heartBeatLog.peek().heartBeat;
    }

    public int logHeartBeat(int heartBeatValue,int time){
        this.heartBeatLog.push(new Pair(time,heartBeatValue));
        return heartBeatValue;
    }
}
