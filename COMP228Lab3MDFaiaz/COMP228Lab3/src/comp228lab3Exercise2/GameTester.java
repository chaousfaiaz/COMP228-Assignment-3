/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comp228lab3Exercise2;

/**
 *
 * @author faiaz
 */
public abstract class GameTester {
    
    private String name; private boolean status;
    public GameTester(String name, boolean status){
        this.name = name;
        this.status = status;
    }
     public double setFullTimeSalary() { return 3000.00; }
     

public boolean getStatus(){ return this.status; }
    public void setStatus (boolean status) { this.status = status; }
    public String getName(){ return this.name; }
    //abstract method
    public abstract double determineSalary();
    public abstract String toString();
}