/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KSnakes;

/**
 *
 * @author kris
 */
public class Poison extends Food{

    public Poison(int x, int y) {
        super(x, y);
    }

    @Override
    public void eaten(SnakeBody snake, int direction) {
        snake.shrink(snake.getBody());
    }
    
    
}
