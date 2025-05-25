package org.example;

public class Steps {
    private int total_steps;
    private User user;
    private int step_goal;

    Steps(User user,int step_goal){
        this.user=user;
        this.total_steps=0;
        this.step_goal=step_goal;
    }

    public int getTotal_steps() {
        return total_steps;
    }

    public int incrementSteps(){
        this.total_steps++;
        if(this.total_steps>=this.step_goal){
            System.out.println("Completed Step Goal");
        }
        return this.total_steps;
    }
}
