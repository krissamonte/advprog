/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tao;

import java.util.ArrayList;

/**
 *
 * @author Student
 */
public class Tao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList <Person> arrPerson = new ArrayList<Person>();
        
        Person p = new Student("Jeffrey", 20, "112");
        Student s = new Student("Jeffrey", 20, "112");
        Student s1 = new Student("Pedro", 23, "112");
        Student s2 = new Student("Juanita", 20, "67890");
        arrPerson.add(s2);
        arrPerson.add(s1);
        arrPerson.add(s);
        
        
        for(int i = 0; i < arrPerson.size(); i++){
           if(arrPerson.get(i) instanceof Student){
           System.out.println(arrPerson.get(i));
           Student a = (Student)arrPerson.get(i); //cast
                System.out.println(a.getpID());           
        }
      
            //abstract classes cannot be instantiated
            //it provides a template for a subclass 
            //must be overridden by the direct child classes
            //you dont instantiate an abstract class, you extend it
            
            
    }
        
     
} //END MAIN
    
    
    
}
