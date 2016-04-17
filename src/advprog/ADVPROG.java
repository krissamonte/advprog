/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advprog;

/**
 *
 * @author kris
 */
import java.util.ArrayList;
import java.util.Random;

public class ADVPROG {

    public static void main(String[] args) {
        //int x, y;
        
        //randomize snake position
        Random rand = new Random();
        int x = rand.nextInt(6);
        System.out.println("x:" + x);
        int y = rand.nextInt(6);
        System.out.println("y:" + y);

        System.out.println("");
        
        //randomize food position
        int f = rand.nextInt(6);
        System.out.println("f:" + f);
        int o = rand.nextInt(6);
        System.out.println("o:" + o);

        int n = 6; 
        int i = 0, j = 0;
        for(i = 0; i < n; i++){
            for(j = 0; j < n; j++){
                if(i == f && j == o){
                    System.out.print("o");
                } else System.out.print(" ");                                            
            }          
            System.out.println("");
        }        
        
        ArrayList <String> asterisk = new ArrayList <String>();
        System.out.println("");
        printSpace(x, y);
        
        
        /*
        System.out.println("Moving left. . . ");
        moveLeft(x, y);
        
        System.out.println("Moving right. . . ");
        moveRight(x, y);
        
        System.out.println("Moving up. . . ");
        moveUp(x, y);
        
        System.out.println("Moving down. . . ");
        moveDown(x, y);
        */
        
    }
    
    public static void printSpace(int x, int y){
        int n = 6; 
        int i = 0, j = 0;
        int size = 4;
        
        for(i = 0; i < n; i++){
            for(j = 0; j < n; j++){
                if(i == x && j == y){
                    System.out.print("*");
                } else System.out.print(" ");                                            
            }          
            System.out.println("");
        }        
    }
 
    public static void moveLeft(int x, int y){
        printSpace(x, y-1);
    }
    
    public static void moveRight(int x, int y){
        printSpace(x, y+1);
    }
    
    public static void moveUp(int x, int y){
        printSpace(x-1, y);
    }
    
    public static void moveDown(int x, int y){
        printSpace(x+1, y);
    }
    
}
