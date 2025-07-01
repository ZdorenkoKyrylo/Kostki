package kostki;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Game {
    private final List<Player> players = new ArrayList();
    private final Random rand = new Random();     //obiekt losujący

    public void addPlayer(Player player) {
        players.add(player);
        //stats.put(player, 0);
    }
    
    public void removePlayers(String name) {
        
       // for (int i=0; i< players.size(); i++){
         //   if ( player.getName().equals(name) ) {
           //     players.remove(i);
            //}
       // }
        
       players.removeIf( player -> player.getName().equals(name) );
    }
    
    public void namePlayers() {
        System.out.println("Wszyscy graczy : "  );
        
        for (Player player : players) {
        System.out.println("Gracz : " + player.getName() );
        }
        
        //players.forEach(System.out.println);
    }
    
    public void printStats(){
        System.out.println("Statystyki : " );
        //System.out.println(stats);
        
    }
    
    public void play() {
        
        int number;
        int guess;
        boolean repeat = true;
        
        try {
            
        do {
            System.out.println("---------------------");

            repeat = true;

            number = rand.nextInt(6) + 1;
            System.out.println("Kostka: " + number);

            for (Player player : players) {
                guess = player.odgadnij(); 
                System.out.println("Gracz " + player.getName() + ": " + guess);

                if (number != guess) {
                    System.out.println("Zle!");
                } else {
                    System.out.println("BRAWO!");
                    
                    repeat = false;
                }
            }

        } while (repeat);

        }catch (IllegalArgumentException e){
            System.out.println("Blad" + e.getMessage());
        }
        

        
    }

}