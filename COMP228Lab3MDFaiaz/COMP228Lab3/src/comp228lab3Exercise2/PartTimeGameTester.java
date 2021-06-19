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
// Part Time Game Tester class that's an extension of the abstract Game Tester class
public class PartTimeGameTester extends GameTester {
    
    private double parttimesalary,hourlyrate=20;
    
    public PartTimeGameTester(String name, boolean status){
        super(name, status);
        
    }
    
    
// Getter method
    public double getPartTimeSalary(){ return parttimesalary; }

    // Setter method
    public void setPartTimeSalary (double hour) { 
        this.parttimesalary = hour*hourlyrate; }

    // Calculate salary
    
    @Override 
    public double determineSalary()
    {
        return getPartTimeSalary();
    }
    @Override
     public String toString() {
        return String.format("%s%nSalary   : $%.2f%n",
            toString(),determineSalary());
        
    } // End of toString method

   
}
