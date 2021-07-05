package com.est14.test3.player;

public class Player {

    private Dice dice;
    private int minNumToWim;

    public Player(Dice dice, int minNumToWim) {
        this.dice = dice;
        this.minNumToWim = minNumToWim;
    }

    public boolean play(){
        int diceNumber = this.dice.roll();
        return minNumToWim >= diceNumber;
    }
}
