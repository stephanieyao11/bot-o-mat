//package sample.models;
//
//public class Player {
//    private String name;
//
//    public Player(String name) {
//        this.name = name;
//    }
//
//}

package sample.models;

import java.util.ArrayList;

public class Player {

    private String name;
    private String robotType;
    private int score;


    public Player(String name, String robotType, int score) {

        this.name = name;
        this.robotType = robotType;
        this.score = score;
    }

    public String getName() {
        return this.name + ", the " + this.robotType;
    }

    public void incScore(int additionalScore) {
        this.score += additionalScore;
    }

    public int getScore() {
        return this.score;
    }
}
