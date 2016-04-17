/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facebook;

/**
 *
 * @author kris
 */
public class Main {
    public static void main(String[] args){
        Person p1 = new Person("Kris", 19, "F");
        Person p2 = new Person("Je", 24, "M");
        Person p3 = new Person("Nike", 20, "F");
        
        p1.createPost("cool");
        p1.createPost("not because you're busy");
        p1.createPost("be yourself");
        
        p2.createPost("i'm gay");
        p2.createPost("just kidding!");

        p3.createPost("plan");
        p3.createPost("do");
        p3.createPost("check");
        p3.createPost("act");

        //PERSON 1 ADDS PERSON 2
        p1.addFriend(p2);
        
        //PERSON 2 ADDS PERSON 3        
        p2.addFriend(p3);
                
        //DISPLAY NEWSFEED OF PERSON 1                
        System.out.println("^DISPLAY NEWSFEED OF PERSON 1");
        p1.displayNewsFeed();
        //DELETE POST 0 OF PERSON 1                         
        System.out.println("^DELETE POST 0 OF PERSON 1");
        p1.deletePost(0);
        //DISPLAY NEWSFEED OF PERSON 1                
        System.out.println("^DISPLAY NEWSFEED OF PERSON 1");
        p1.displayNewsFeed();

        //DISPLAY NEWSFEED OF PERSON 1                        
        System.out.println("^DISPLAY FRIENDS OF PERSON 1");
        //System.out.println("p1 size: " + p1size);        
        System.out.println(p1.getName() + "'s FRIENDS");
        p1.displayFriendsList();
        
        //REMOVE P2 AS FRIEND OF P1                         
        System.out.println("^REMOVE P2 AS FRIEND OF P1");
        p1.removeFriend(p2);
        
        //DISPLAY FRIENDS OF PERSON 2                         
        System.out.println("^DISPLAY FRIENDS OF PERSON 2");
        System.out.println(p2.getName() + "'s FRIENDS");
        p2.displayFriendsList();
        
        //ADD PERSON 3 TO FRIENDS OF PERSON 1 
        System.out.println("^ADD PERSON 3 TO FRIENDS OF PERSON 1");
        p1.addFriend(p3);
        
        //DISPLAY FRIENDS OF PERSON 3
        System.out.println(p3.getName() + "'s FRIENDS");        
        p3.displayFriendsList();
        
        //DISPLAY NEWSFEED OF PERSON 3
        System.out.println(p3.getName() + "'s NEWSFEED");
        p3.displayNewsFeed();
        
        //DELETE ALL POSTS OF PERSON 3
        System.out.println(p3.deleteAllPosts() + " posts deleted");
        
        //DISPLAY NEWSFEED OF PERSON 3
        System.out.println(p3.getName() + "'s NEWSFEED");
        p3.displayNewsFeed();
    } //END MAIN
}
