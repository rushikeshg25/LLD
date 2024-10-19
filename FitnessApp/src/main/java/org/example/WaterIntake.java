package org.example;

public class WaterIntake {
    private User user;
    private int water_amt;

    WaterIntake(User user){
        this.water_amt=0;
        this.user=user;
    }

    WaterIntake(User user,int water_amt){
        this.water_amt=water_amt;
        this.user=user;
    }

    public void increment(int water_drank){
        this.water_amt+=water_drank;
        drinkMoreWater();
    }

    public void drinkMoreWater(){
        if(water_amt<6){
            System.out.println("Drink More Water");
        }
    }

    public void reward(){
        if(water_amt>=6){
            System.out.println("Congrats on drinking enough water");
        }
    }
}
