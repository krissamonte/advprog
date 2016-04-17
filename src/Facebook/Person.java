/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facebook;

import java.util.ArrayList;

/**
 *
 * @author kris
 */
public class Person extends Post{
    private String name;
    private String gender;
    private int age;
    private ArrayList <Post> posts = new ArrayList();
    private ArrayList <Person> friends = new ArrayList();
    
    public Person(String pName, int pAge, String pGender){
        this.name = pName;
        this.gender = pGender;
        this.age = pAge;
        //posts.add(new Post("hello")); //in ArrayList of posts a Person has, populate Post        
    }
    
    public void createPost(String pMessage){
        posts.add(new Post(pMessage));
    } 
    
    public void deletePost(int index){
        posts.remove(index);
    } 
    
    public int deleteAllPosts(){
        int noOfPosts = posts.size();        
        posts.clear();
        
    return noOfPosts;
    } 

    public void addFriend(Person pToAdd){
        friends.add(pToAdd);
        pToAdd.friends.add(new Person(getName(), getAge(), getGender()));        
    }
    
    public void removeFriend(Person pToRemove){        
        friends.remove(pToRemove);
        Person me = new Person(getName(), getAge(), getGender());
        
        for(int i = 0; i < pToRemove.friends.size(); i++){
            if(getName() == pToRemove.friends.get(i).getName()){
                pToRemove.friends.remove(i);
            }
        }
        
    }
    
    public void displayProfile(){
        System.out.println(name + " " + gender + " " + age);
    }
    
    public void displayNewsFeed(){
        for(int i = posts.size()-1; i >= 0; i--){
            posts.get(i).display();
        }
    }

    public void displayFriendsList(){
        for(int i = 0; i < friends.size(); i++){
            System.out.println(friends.get(i).getName() + " " + friends.get(i).getGender() + " " + friends.get(i).getAge() );
        }
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public ArrayList<Post> getPosts() {
        return posts;
    }

    public ArrayList<Person> getFriends() {
        return friends;
    }
    
    
}
