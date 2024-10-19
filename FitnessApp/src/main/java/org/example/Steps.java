package org.example;

public class Steps {
    private int total_steps;
    private User user;

    Steps(User user){
        this.user=user;
        this.total_steps=0;
    }

    public int getTotal_steps() {
        return total_steps;
    }

    public void incrementSteps(){
        total_steps++;
    }
}
