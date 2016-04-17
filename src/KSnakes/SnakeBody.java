/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KSnakes;

import java.util.ArrayDeque;

/**
 *
 * @author kris
 */
public class SnakeBody extends Point{
    ArrayDeque <Point> body = new ArrayDeque <Point>();
    
    public SnakeBody(int x, int y){
        super(0,0);
        initBody();
    }
    
    public void initBody(){        
        body.add(new Point(x, y));
        body.add(new Point((x+1), y));
        body.add(new Point((x+2), y));
        body.add(new Point((x+3), y));
        body.add(new Point((x+4), y));
        body.add(new Point((x+5), y));
        body.add(new Point((x+6), y));
        body.add(new Point((x+7), y));
        body.add(new Point((x+8), y)); //first element
        
        
    }
    
    public ArrayDeque <Point> getBody(){
        return body;
    }
    
    public int snakeSize(ArrayDeque <Point> getBody){
        int size = 0;
        size = getBody().size();
        return size;
    }
    
    public Point getHead(ArrayDeque <Point> body){
        Point coor;
        coor = body.getFirst();
        return coor;
    }
    
    public void grow(ArrayDeque <Point> body, int direction){
        x = body.getLast().getX();
        y = body.getLast().getY();
        
        switch(direction){
            case 37: addLeft();break;
            case 38: addUp();break;
            case 39: addRight();break;
            case 40: addDown();break;
        }        
        
    }

    
    public void shrink(ArrayDeque <Point> body){
        body.remove(body.getLast());
    }
    
    public void doubleAdd(ArrayDeque <Point> body, int direction){
        grow(body, direction);
        grow(body, direction);
    }
    
    public int faster(ArrayDeque <Point> body){
        int n = 1000;        
        return n; 
    }
    
    public int slower(ArrayDeque <Point> body){
        int n = 500;        
        return n; 
    }
    
    //START ADD
    public void addRight(){
        Point last = body.getLast();
        int col = Main.g.getCols();
        body.add(new Point((((last.getX() +1)%col)+col)%col, last.getY()));
    }
    
    public void addUp(){
        Point last = body.getLast();
        int row = Main.g.getRows();
        body.add(new Point(last.getX(), (((last.getY()-1)%row)+row)%row));                        
    }

    public void addLeft(){
        Point last = body.getLast();
        int col = Main.g.getCols();
        body.add(new Point((((last.getX()-1)%col)+col)%col, last.getY()));
    }
    
    public void addDown(){
        Point last = body.getLast();
        int row = Main.g.getRows();
        body.add(new Point(last.getX(), (((last.getY()+1)%row)+row)%row));
    }
    //END ADD
    
            
    public void moveRight(){
        body.removeFirst();
        Point last = body.getLast();
        int col = Main.g.getCols();
        body.add(new Point((((last.getX() +1)%col)+col)%col, last.getY()));
    }
    
    public void moveUp(){
        body.removeFirst();
        Point last = body.getLast();
        int row = Main.g.getRows();
        body.add(new Point(last.getX(), (((last.getY()-1)%row)+row)%row));                        
    }

    public void moveLeft(){
        body.removeFirst();
        Point last = body.getLast();
        int col = Main.g.getCols();
        body.add(new Point((((last.getX()-1)%col)+col)%col, last.getY()));
    }
    
    public void moveDown(){
        body.removeFirst();
        Point last = body.getLast();
        int row = Main.g.getRows();
        body.add(new Point(last.getX(), (((last.getY()+1)%row)+row)%row));
    }
    
        
}
