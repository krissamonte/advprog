/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package point;

import java.util.ArrayDeque;

/**
 *
 * @author mvcalsado
 */
public class SnakeBody {
    
    ArrayDeque<Point> body = new ArrayDeque<>();
    
    
    public SnakeBody(){
        initBody();
    }
    
    public void initBody(){
        body.add(new Point(0,0));
        body.add(new Point(1,0));
    }
    
  public ArrayDeque<Point> getBody(){
      return body;
  }
  
  public void setBody(ArrayDeque<Point> body){
      this.body = body;
  }
  
  public void moveRight(){
      body.removeFirst();
      Point last = body.getLast();
      
      int col = Snake.g.getCol();

      body.add(new Point((((last.getX() +1)%col)+col)%col, last.getY()));
  }
    public void moveUp(){
      body.removeFirst();
      Point last = body.getLast();
      
      int row = Snake.g.getRows();
      
      body.add(new Point(last.getX() , (((last.getY()-1)% row) + row) %row));
  }
      public void moveLeft(){
      body.removeFirst();
      Point last = body.getLast();
      
      int col = Snake.g.getCol();
      
      body.add(new Point((((last.getX() -1)%col)+col)%col , last.getY()));
  }
      public void moveDown(){
      body.removeFirst();
      Point last = body.getLast();
      int row = Snake.g.getRows();
      body.add(new Point(last.getX()  , (((last.getY()+1)% row) + row) %row));
  }
    

    
}
