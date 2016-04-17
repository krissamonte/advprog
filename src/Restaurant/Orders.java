/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restaurant;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Student
 */
public class Orders {
    private ArrayList <Food> food;
    private Date date; 
    private float totalCost;

    public Orders(ArrayList <Food> food, Date date, float totalCost){
        this.food = food;
        this.date = new Date();
        this.totalCost = totalCost;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public float getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(float totalCost) {
        this.totalCost = totalCost;
    }
    
    public void addOrder(ArrayList <Food> food){
        
    }

    /**
     * @return the food
     */
    public ArrayList <Food> getFood() {
        return food;
    }

    /**
     * @param food the food to set
     */
    public void setFood(ArrayList <Food> food) {
        this.food = food;
    }
}
