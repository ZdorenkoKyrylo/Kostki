package kostki;

import java.util.Random;

public class PlayerComp extends Player {
    private Random r = new Random();
    
    public PlayerComp (){
        
    }
    
    public PlayerComp (String name){
        super(name);
    }
    
    public int odgadnij (){
        return r.nextInt(6)+1;
    }
}