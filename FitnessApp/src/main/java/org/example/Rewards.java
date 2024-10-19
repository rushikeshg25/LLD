package org.example;

public class Rewards {
    private int reward;
    private User user;

    Rewards(User user){
        this.user=user;
        this.reward=0;
    }

    public int getReward() {
        return reward;
    }

    public int addReward(int reward_gained){
        this.reward+=reward_gained;
        return reward;
    }
}
