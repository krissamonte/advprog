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
public class Point {
    public int x; 
    public int y;
    
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public void setPoint(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public int getX(){
        return x;
    }
      
    public int getY(){
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    
    
}