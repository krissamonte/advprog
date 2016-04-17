/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Person;

/**
 *
 * @author kris
 */

public class Person implements Actions{

    @Override
    public void run() {
        System.out.println("Running. . .");
    }

    @Override
    public void walk() {
        System.out.println("Walking. . .");
    }

    @Override
    public void swim() {
        System.out.println("Swimming. . .");
    }

    
}
