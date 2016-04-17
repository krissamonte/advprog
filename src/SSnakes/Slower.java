/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SSnakes;

/**
 *
 * @author kris
 */
public class Slower extends Food{

    public Slower(int x, int y) {
        super(x, y);
    }

    @Override
    public void eaten(SnakeBody snake, int direction) {
        snake.slower(snake.getBody());
    }
    
}
