package org.example;

public class Calories {
    private User user;
    private int calories;
    private int calorie_goal;

    Calories(User user,int calorie_goal){
        this.user=user;
        this.calories=0;
        this.calorie_goal=calorie_goal;
    }

    public int getCalories() {
        return calories;
    }

    public int addCalories(int calories_consumed){
        this.calories+=calories_consumed;
        if(this.calories>this.calorie_goal){
            System.out.println("Consumed more calories");
        }
        return calories;
    }

    public int removeCalories(int calories_burnt){
        this.calories-=calories_burnt;
        if(this.calories<this.calorie_goal){
            System.out.println("Consume more calories");
        }
        return calories;
    }}
