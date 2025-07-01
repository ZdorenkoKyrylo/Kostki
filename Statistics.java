package kostki;

import java.util.HashMap;

public class Statistics {
    
    private HashMap<Player,Integer> stats = new HashMap<>();
    
    public void print(){
        System.out.println("Statystyki : " );
        
        for (Player p : stats.keySet()){
            System.out.println(p.getName() + ":" + stats.get(p));
        }
    }    
    
    public void update(Player player, int points){
        stats.put( player, stats.get(player) + 1 );
    }
}