/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advprog;

import java.util.ArrayDeque;
import advprog.Point;
/**
 *
 * @author kris
 */
public class SnakeBody {

    ArrayDeque <Point> body = new ArrayDeque();
    
    public SnakeBody(){
        
    }
        
    public void initBody(){
        int x = 0, y = 0;
        
        body.add(new Point(x,y));
        body.add(new Point(x,y+1));
    }

    public void moveRight(){
        body.removeFirst();
        Point last = body.getLast();
        System.out.println("");
        body.add(new Point(last.getX()+1, last.getY()));
        
    }

    public ArrayDeque<Point> getBody() {
        return body;
    }

    
}