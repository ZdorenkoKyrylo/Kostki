package kostki;

import java.util.Random;
import java.util.Scanner;

public abstract class Player {
    private Random r = new Random();
    String name = "Anonimus";
    
    public Player() {
        
    }
    
    public Player(String name) {
    setName(name);
}
    
    public String toString(){
        return name;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName ( String name){
        //if (name.isEmpty() || name == null ) {
        if (name != null && name.matches("^[a-zA-Z0-9._-]{3,}$") ){
        this.name = name;}

        else {
        //System.err.println(" Niepoprawne imie "); 
        throw new IllegalArgumentException(" Niepoprawne imie ");
        
        }
    };
    public abstract int odgadnij ();
}