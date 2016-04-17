/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transportation;

/**
 *
 * @author kris
 */
public class Main {
    
    public static void main(String[] args){
        Cars c = new Cars("Honda");
        Boat b = new Boat("Maersk");
                
        System.out.println(c.getName());        
    }
    
}
