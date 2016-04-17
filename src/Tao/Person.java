/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tao;

/**
 *
 * @author Student
 */
public abstract class Person {
   private String pName;
   private int pAge;
   
   public Person(String pName, int pAge){
       this.pName = pName;
       this.pAge= pAge;
   }
 public String toString(){
        return getpName() + "\n" + getpAge();
        
    }
    /**
     * @return the pName
     */
    public String getpName() {
        return pName;
    }

    /**
     * @param pName the pName to set
     */
    public void setpName(String pName) {
        this.pName = pName;
    }

    /**
     * @return the pAge
     */
    public int getpAge() {
        return pAge;
    }

    /**
     * @param pAge the pAge to set
     */
    public void setpAge(int pAge) {
        this.pAge = pAge;
    }
      
    public abstract void move();

    
}
