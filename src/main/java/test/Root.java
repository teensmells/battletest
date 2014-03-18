package test;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Hello world!
 */
public class Root {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Game game = new Game();
        game.init();
        game.startBattle();
        Candidate winner = game.decideWinner();
        System.out.println("the winner is " + winner.getName() + ", winRate is " + winner.getWinRate());
    }
}
