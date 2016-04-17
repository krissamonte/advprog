/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restaurant;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Restaurant {
    public static void main(String[] args){
        
        ArrayList <Customer> customers = new ArrayList <Customer>();
        
        ArrayList <Food> foodList = new ArrayList <Food>();
        foodList.add(new Food("CaliMaki", "Fish", 75));
        foodList.add(new Food("Subs", "Veg", 50));
        foodList.add(new Food("Pork", "Meat", 35));
        foodList.add(new Food("Subs", "Veg", 50));
        foodList.add(new Food("Kangkong", "Veg", 50));
        foodList.add(new Food("Salad", "Veg", 50));
        
        Date date = new Date();
        
        ArrayList <Orders> orderListAndrea = new ArrayList <Orders>();
        orderListAndrea.add(new Orders(foodList, date, 5234));        
        customers.add(new Customer("Andrea", "Taft", 12312, orderListAndrea));
        
        ArrayList <Orders> orderListKris = new ArrayList <Orders>();
        orderListKris.add(new Orders(foodList, date, 5234));        
        customers.add(new Customer("Kris", "Manila", 12312, orderListKris));
        
        //searchBestSelling(customers);
        searchBestCustomer(customers);       
    }
    
    public void getVegetarianMenu(ArrayList <Food> foodList){
        for(int y = 0; y < foodList.size(); y++){
            if(foodList.get(y).getType().equals("Veg")){            
                //DISPLAY FOOD DETAILS
                System.out.println(foodList.get(y).getName() + " " + foodList.get(y).getType() + " " + foodList.get(y).getPrice());
            }
        }
    }
    
    public static void searchBestSelling(ArrayList <Customer> customers){
        //return food type
        int count = 0;
        boolean veg = false;
        Food best;
        
        ArrayList <Orders> orders = new ArrayList<Orders>();
        
        ArrayList <Orders> specificOrders = new ArrayList <Orders>();
        for(int i = 0; i < customers.size(); i++){
            specificOrders = customers.get(i).getOrders();
            for(int j = 0; j <specificOrders.size(); j++){
                orders.add(specificOrders.get(j));
            }
        }
        
        int countMeat = 0;
        int countFish = 0;
        int countVeg = 0;
        
        
        for(int i = 0; i < orders.size(); i++){
            int orderSize = orders.get(i).getFood().size();
            for(int j = 0; j < orderSize; i++){
                String orderType = orders.get(i).getFood().get(i).getType();
                if(orderType.equals("Meat")){
                    countMeat++;
                }else if(orderType.equals("Fish")){
                    countFish++;
                }else if(orderType.equals("Veg")){
                    countVeg++;
                }
            }
        }
        
        //algorithim to compare and find out which count is the highest count

        boolean check = false;
        do{
            
            if(countMeat < countFish && countFish > countVeg){
                System.out.println("FISH!");
                check = true;
            }else if(countFish < countMeat && countVeg < countMeat){
                System.out.println("MEAT");
                check = true;
            }else if(countFish < countVeg && countVeg > countMeat){
                System.out.println("VEG");
                check = true;
            }
            
        }while(!check);
        
    }

    public static void searchBestCustomer(ArrayList <Customer> customers){
        Customer a = customers.get(0);
        Customer b = customers.get(1);

        System.out.println(Math.max(a.getOrders().get(0).getTotalCost(), b.getOrders().get(0).getTotalCost()));
        float top = Math.max(a.getOrders().get(0).getTotalCost(), b.getOrders().get(0).getTotalCost());
        
        if(a.getOrders().get(0).getTotalCost() == top){
            System.out.println("Customer " + a.getName());
        } else System.out.println("Customer " + b.getName());
        
    }
}
