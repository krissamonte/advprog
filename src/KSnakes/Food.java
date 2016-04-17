/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KSnakes;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author kris
 */
public abstract class Food extends Point{
    private int rows = 44;
    private int cols = 147;
    private SnakeBody snake = new SnakeBody(0,0);
        
    ArrayList <Point> foodList = new ArrayList <Point>();

    public Food(int x, int y){
        super(20, 5);                
        initFood();
    }
    
    public void initFood(){
        foodList.add(new Point(11, 5));
        foodList.add(new Point(40, 11));        
        foodList.add(new Point(21, 7));        
    }
    
    public ArrayList <Point> getFoodList(){
        return foodList;
    }

    public void randomizeFood(){
        Random randNum = new Random();
        
        int x = randNum.nextInt(cols);
        int y = randNum.nextInt(rows);
        
        setX(x);
        setY(y);
    }
    
    public Point randomizeFood(boolean checker){
        Random randNum = new Random();
        int x = randNum.nextInt(cols);
        int y = randNum.nextInt(rows);
        
        setX(x);
        setY(y);
        Point food = new Point(0,0);
        /*
        if(checker == true){
            food = new Point(x, y);                
        }
        */
        
        food = new Point(x,y);
        return food;
    }
    
    public boolean isOkayToRandFood(SnakeBody snake){
        int snakeSize = snake.snakeSize(snake.getBody());
        boolean checker = true;
                
        Point foodLoc = randomizeFood(checker);
        for(int i = 0; i < snakeSize; i++){            
            if(foodLoc == snake.getBody().getFirst() || foodLoc == snake.getBody().getLast()){ //check if food location is equal to any point in the snakebody
                checker = false; //do not randomize
            }
        } checker = true;
                
    return checker;    
    }
    
    public void clearFood(Point f){
        ArrayDeque <Point> foodList = new ArrayDeque <Point> ();
        
        Point ff = foodList.getFirst();        
        foodList.remove(ff);        
    }

    public Point getFood(){
        //Point f = foodList.get(i); //gets food from foodList               
        //return f;
        
        Point f = new Point(x, y);
        return f;
    }
    
    public abstract void eaten(SnakeBody snake, int direction);

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }
    
    
}
