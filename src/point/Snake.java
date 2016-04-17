/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package point;

/**
 *
 * @author mvcalsado
 */
public class Snake {

    /**
     * @param args the command line arguments
     */
    
    public static GameWindow g;
    
    public static void main(String[] args) {
        // TODO code application logic here
        g = new GameWindow();
        g.gameLoop();
    }
    
}
