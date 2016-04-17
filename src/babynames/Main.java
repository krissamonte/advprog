/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package babynames;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Student
 */
public class Main {
    public static void main(String[] args){
        ArrayList <String> girlNames = new ArrayList ();
        ArrayList <String> boyNames = new ArrayList ();
        ArrayList <String> babyNames = new ArrayList ();
        
        girlNames.add("Chelsea");
        girlNames.add("Nicole");
        girlNames.add("Monica");
        
        boyNames.add("Clint");
        boyNames.add("Anthony");
        boyNames.add("Pavan");

        babyNames.add("Zen");
        babyNames.add("Didi");
        babyNames.add("Gona");
        
        //ADD GIRLNAMES
        for(int g = 0; g < girlNames.size(); g++){
            babyNames.add(girlNames.get(g));            
        }
        
        //ADD BOYNAMES
        for(int b = 0; b < boyNames.size(); b++){
            babyNames.add(boyNames.get(b));            
        }
        
                
        for(int i = 0; i < babyNames.size(); i++){
            for(int j = 0; j < girlNames.size(); j++){
                if(babyNames.get(i) == girlNames.get(j)){
                    System.out.println(babyNames.get(i) + ": girl" );
                } 
            }
            
            for(int j = 0; j < boyNames.size(); j++){
                if(babyNames.get(i) == boyNames.get(j)){
                    System.out.println(babyNames.get(i) + ": boy" );
                } 
            }
        }
        
        Collections.sort(babyNames);
        
        System.out.println("SORTED ALPHABETICALLY");
/*        for(int b = 0; b < babyNames.size(); b++){
            //System.out.println(babyNames.get(b)); 
            if(boy){
                System.out.println(babyNames.get(b) + ": Boy");
            } else if (girl){
                System.out.println(babyNames.get(b) + ": Girl");
            } else
                System.out.println(babyNames.get(b) + ": Unknown");
        }
        */
        
        
    }
}
