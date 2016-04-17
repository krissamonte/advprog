/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restaurant;

import java.util.ArrayList;

/**
 *
 * @author Student
 */
public class Customer {
    private String name;
    private String address;
    private int contactNo;
    private ArrayList <Orders> orders;

    public Customer(String name, String address, int contactNo, ArrayList<Orders> orders) {
        this.name = name;
        this.address = address;
        this.contactNo = contactNo;
        this.orders = orders;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getContactNo() {
        return contactNo;
    }

    public void setContactNo(int contactNo) {
        this.contactNo = contactNo;
    }

    public ArrayList <Orders> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList <Orders> orders) {
        this.orders = orders;
    }
    
    //DISPLAY CUSTOMER
    public void displayCustomer(){
        System.out.println(getName() + " " + getAddress() + " " + getContactNo() + " " + getOrders());
    }
    
}
