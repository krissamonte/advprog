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
public class Student extends Person{
    
    private String pID;
    
    public Student(String pName, int pAge, String pID){
        
        super(pName, pAge);
        this.pID = pID;
        
    }
    
    public String toString(){
        return getpName() + "\n" + getpAge() + "\n" + getpID();
        
    }
    /**
     * @return the pID
     */
    public String getpID() {
        return pID;
    }

    /**
     * @param pID the pID to set
     */
    public void setpID(String pID) {
        this.pID = pID;
    }

    @Override
    public void move() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
