package kostki;

import java.util.Scanner;

public class playerHuman extends Player {
    private Scanner sc = new Scanner(System.in);
    
    public playerHuman (){
        
    }
    
    public playerHuman (String name){
        super(name);
    }
    
    public int odgadnij(){
        System.out.println("Wpisz liczbe : ");
        return sc.nextInt() ;
    }
}