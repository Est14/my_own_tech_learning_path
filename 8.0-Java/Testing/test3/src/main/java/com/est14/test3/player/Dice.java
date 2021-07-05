package com.est14.test3.player;

import java.util.Random;

public class Dice {

    private int sides;

    public Dice(int sides) {
        this.sides = sides;
    }

    public int roll(){
        int i = new Random().nextInt(this.sides) + 1;
        return i;
    }
}
