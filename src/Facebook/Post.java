/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facebook;

import java.util.Date;

/**
 *
 * @author kris
 */
public class Post {
    private String message;
    private Date timestamp;
    
    public Post(String message){
        this.message = message;
        timestamp = new Date();        
    }

    public Post() {
    }
    
    public void display(){
        System.out.println(timestamp.toString() + " : " + message);
    }
    
}
