package kostki;

import java.util.Random;
import java.util.Scanner;



public class Kostki {
 
    public static void main(String[] args) {
        Game game = new Game();

        game.addPlayer(new PlayerComp("Janusz"));
        game.addPlayer(new PlayerComp("Ziuta"));
        
        game.removePlayers("Ziuta");
        game.namePlayers();
        game.play();
        game.printStats();
    }

}