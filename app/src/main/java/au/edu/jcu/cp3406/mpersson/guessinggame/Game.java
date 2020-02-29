package au.edu.jcu.cp3406.mpersson.guessinggame;

import java.util.Random;

public class Game {
    private int answer;
    Game() {

        Random random = new Random();
        answer = random.nextInt(10) + 1;
    }

    public boolean check(int guess) {
        return guess == answer;
    }

}
