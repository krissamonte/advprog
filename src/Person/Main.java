/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Person;

import java.util.Scanner;

/**
 *
 * @author kris
 */
public class Main {
    public static void main(String[] args){
        Actions a = new Person();
        
        System.out.print("Type of Person: ");
        Scanner sc = new Scanner(System.in);
        int c = 0;
        c = sc.nextInt();
        switch(c){
            case 1: 
                a.run();
                break;
            case 2: 
                a.walk();
                break;
            case 3: 
                a.swim();
                break;
        }
    }
}
