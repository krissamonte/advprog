/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author kris
 */
public class Main {
  
    public static void main(String[] args){
        /*
        JFrame frame = new JFrame("FrameDemo");  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        //frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
                
        */
        
        GameWindow g = new GameWindow();
        g.displaySnake();
    }
  
}
