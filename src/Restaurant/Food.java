/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restaurant;

/**
 *
 * @author Student
 */
public class Food {
    private String name;
    private String type;
    private float price;
    
    public Food(String name, String type, float price){
        this.name = name; 
        this.type = type;
        this.price = price;
    }

    public int checkFoodType(String type){
        int t = 0; 
        if(type == "Vegetables"){
            t = 1;
        } else if(type == "Snacks"){
            t = 2;
        }
    
        return t;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
    
}
